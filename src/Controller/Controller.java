/*
 * BSD License
 *
 * Open Source Fixedpoint Model-Checker Graphical User Interface version 2019
 *
 * (C) Copyright �lfur J�hann Edvardsson 2019
 * (C) Copyright Veronica Julie Lodskov Hoffmann 2019
 *
 * All Rights Reserved.
 *
 */

package Controller;

import Model.AnalyseProtocol;
import Model.Config;
import Model.TheParser;
import Model.Tracer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;

import org.fxmisc.richtext.CodeArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class Controller implements Initializable{

	private File file;
	private List<String> list;
	private AnalyseProtocol ap;
	private Tracer tracer;
	private Config config;
	private TheParser parser;
	private String protocol;
	private SimpleTab simpleProtocol, simpleAttack;
	private DiagramTab protocolDiagram, attackDiagram;
    private Highlighting highlighting;
	private TraceTab traceTab;
	private String oldText;
	private CodeArea protocolCodeArea;

	@FXML
	Button traceBtn, analyseBtn;

	@FXML
	SplitPane splitPane;

	@FXML
	BorderPane applicationPane;

	@FXML
	TabPane attackTabPane;

	@FXML
	Tab protocolEditorTab, simplifiedTab, simplifiedAttackTab, protocolDiagramTab, attackDiagramTab, outputText;


	@FXML private TextArea textRight;
	@FXML private Label statusBar;

	@FXML
    ToggleButton toggleThemeBtn;


	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		// Load content for all tabs
		try {
			loadProtocolEditorTab();
			loadDiagramTab(true);
			loadDiagramTab(false);
			loadSimpleTab(true);
			loadSimpleTab(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

		disableTrace();
		disableAnalyse();

		// Initialize variables
		this.protocol = "";
		this.config = new Config();
		this.tracer = new Tracer(null);
		this.list = new ArrayList<>();
		ap = new AnalyseProtocol();
		oldText = "";

		// Update max width for simple view when moving divider
		splitPane.getDividers().get(0).positionProperty().addListener(event->{
			updateMaxWidth(simpleProtocol.getTextFlow());
			updateMaxWidth(simpleAttack.getTextFlow());
		});
	}

	// Disable trace button if protocol editor is empty
	void disableTrace() {
		traceBtn.setDisable(protocolCodeArea.getText().trim().isEmpty());
	}

	// Disable analysis if protocol editor is empty
	void disableAnalyse() {
		analyseBtn.setDisable(protocolCodeArea.getText().trim().isEmpty());
	}

	// Update max width of text flow
	private void updateMaxWidth(TextFlow simpleView) {
		for (Node node : simpleView.getChildren()) {
			if (node instanceof Label) {
				((Label)node).setMaxWidth(simpleView.getWidth());
			}
		}
	}

	// Set the text in the protocol editor
	private void setProtocolCodeArea(String text) {
		if (!text.equals(protocolCodeArea.getText())) {
			protocolCodeArea.replaceText(0, protocolCodeArea.getText().length(), text);
		}
	}

	// Analyze the protocol
	@FXML
	protected void handleAnalyseButtonAction() throws IOException, InterruptedException {

		// Check if the tabs has changed
		tabChange();

		// Set configurations
		if(!config.locationCheck()) {
			config.locateOFMC();
		}
		ap.setConfigs(config.getConfigs());

		if(ap.getSyntaxError()) {
			statusBar.setText("Syntax Error!");
			statusBar.setId("redID");
			// create some error ?
//			return;
		}

		ap.run(protocolCodeArea.getText());

		textRight.setText(ap.getAnalysis());
		if (ap.getSyntaxError()) {
			if (ap.getAnalysis().equals("")) textRight.setText(ap.geterrormsg());
			attackTabPane.getSelectionModel().select(outputText);
			return;
		}
		

		// Initialize tabs in attack trace
		attackDiagram.initData(this, false);
		simpleAttack.initData(this, false);

		// Apply highlighting
		try{
			highlighting = new Highlighting(simpleAttack, attackDiagram, simpleProtocol, protocolDiagram);
		} catch (Exception ignore){}

		if(ap.getAttackFound()) {
			statusBar.setText("Attack Found!");
			statusBar.setId("orangeID");
		} else {
			statusBar.setText("No Attack Found!");
			statusBar.setId("greenID");
		}
	}

	// Load a protocol to the protocol editor
	@FXML protected void handleBrowseButtonAction() throws IOException {

		ap = new AnalyseProtocol();

		this.parser = new TheParser("p");
		FileChooser chooser = new FileChooser();
		chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter( "AnB Files", "*.AnB"));
		file = chooser.showOpenDialog(null);

		this.list = new ArrayList<>();

		if (file != null) {
			try (BufferedReader br = Files.newBufferedReader(Paths.get(file.getPath()))) {
				list = br.lines().collect(Collectors.toList());
			} catch (IOException e) {
				return;
			}
		}
		protocol = "";
		for (String line : list) {
			protocol = String.format("%s%s\n", protocol, line);
		}
		if(protocol.equals("")) {
			return;
		}
		ap.modifyProtocol(protocol);

		if(ap.getSyntaxError()) {
			statusBar.setText("Syntax Error!");
			statusBar.setId("redID");
		} else {
			statusBar.setText("Syntax OK");
			statusBar.setId("greenID");
		}

		setProtocolCodeArea(protocol);

		tabChange();
	}

	// Trace through a protocol
	@FXML protected void handleTraceButtonAction() throws IOException {
		this.parser = new TheParser("p");
		statusBar.setText("Tracing");
		this.tracer = new Tracer(parser);

		if(!config.locationCheck()) {
			config.locateOFMC();
			if (!config.locationCheck()) return;
		}
		tracer.setConfigs(config.getConfigs());
		tracer.modifyProtocol(protocolCodeArea.getText());
		if(parser.syntaxError) {
			statusBar.setText("Syntax Error!");
			statusBar.setId("redID");
			return;
		}
		tracer.runTrace();
		createTracerTab();
	}

	// Save the protocol to a file
	@FXML protected void handleSaveButtonAction() {
		FileChooser chooser = new FileChooser();
		chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter( "AnB Files", "*.AnB"));

		try{
			file = chooser.showSaveDialog(null);
		} catch (Exception e) {
			return;
		}

		if (file != null) {
			saveTextToFile(protocolCodeArea.getText(), file);
			protocol = protocolCodeArea.getText();
		}
	}

	@FXML protected void handleConfigButtonAction() {
		config.sConfig();
	}

	private void saveTextToFile(String content, File file) {
		try {
			PrintWriter writer;
			writer = new PrintWriter(file);
			writer.println(content);
			writer.close();
		} catch (IOException ignored) {

		}
	}

	// Load FXML
	private FXMLLoader load(String fxmlURL, Tab tab) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlURL));
		tab.setContent(loader.load());
		return loader;
	}

	private void loadProtocolEditorTab() throws IOException {
		FXMLLoader loader = load("/View/protocolEditor.fxml", protocolEditorTab);
		ProtocolEditor protocolEditor = loader.getController();
		protocolEditor.initData(this);
		protocolCodeArea = protocolEditor.getProtocolCodeArea();
	}

	private void loadDiagramTab(boolean isProtocol) throws IOException {
		if (isProtocol) {
			FXMLLoader loader = load("/View/diagramTab.fxml", protocolDiagramTab);
			protocolDiagram = loader.getController();
		} else {
			FXMLLoader loader = load("/View/diagramTab.fxml", attackDiagramTab);
			attackDiagram = loader.getController();
			attackDiagram.initData(this, false);
		}
	}

	private void loadSimpleTab(boolean isProtocol) throws IOException {
		if (isProtocol) {
			FXMLLoader loader = load("/View/simpleTab.fxml", simplifiedTab);
			simpleProtocol = loader.getController();
		} else {
			FXMLLoader loader = load("/View/simpleTab.fxml", simplifiedAttackTab);
			simpleAttack = loader.getController();
			simpleAttack.initData(this, false);
		}
	}

	private void createTracerTab() throws IOException {
		Tab newTab = new Tab("Tracer");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/traceTab.fxml"));
		newTab.setContent(loader.load());
		attackTabPane.getTabs().add(newTab);
		traceTab = loader.getController();
		traceTab.initData(simpleProtocol, protocolDiagram, tracer);

		attackTabPane.getSelectionModel().select(newTab);
	}

	// The dialog that pops up on exit if theres unsaved work
	public void promptSaveDialog() {
		if (this.protocol.equals(protocolCodeArea.getText())) {
			javafx.application.Platform.exit();
			System.exit(0);
		}

		Alert alert = new Alert(Alert.AlertType.NONE);
		alert.setTitle("Current Protocol has been modified");
		alert.setContentText("Do you want to save the protocol?");
		ButtonType yesButton = new ButtonType("Yes", ButtonBar.ButtonData.YES);
		ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.NO);
		ButtonType cancelButton = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
		alert.getButtonTypes().setAll(yesButton, noButton, cancelButton);
		alert.showAndWait().ifPresent(type -> {
			if (type.toString().contains("Yes")) {
				handleSaveButtonAction();
			} else if (type.toString().contains("No")) {
				javafx.application.Platform.exit();
				System.exit(0);
			} else {
				return;
			}
		});
	}

	// Update the tabs
    private void updateTabs() {
        ap = new AnalyseProtocol();
        ap.modifyProtocol(protocolCodeArea.getText());
        if (ap.getSyntaxError()) {
            statusBar.setText("Syntax Error!");
            statusBar.setId("redID");
            // create some error ?
        } else {
			statusBar.setText("Syntax OK!");
			statusBar.setId("greenID");
			protocolDiagram.initData(this, true);
			simpleProtocol.initData(this, true);
        }

        if (attackDiagram != null) {
            attackDiagram.clearDiagram();
            attackDiagram.nothingToShow();
            simpleAttack.clearSimple();
            simpleAttack.nothingToShow();
        }
    }

    // When protocol text has changed then update tabs
    public void tabChange() throws IOException {
        if (!oldText.equals(protocolCodeArea.getText())) {
            updateTabs();
            oldText = protocolCodeArea.getText();
        }
    }

    // Change theme
    public void toggleTheme() {
	    if (toggleThemeBtn.isSelected()) {
            setTheme("/View/lightTheme.css", "Dark Theme");
        } else {
            setTheme("/View/darkTheme.css", "Light Theme");
        }
    }

    void setTheme(String css, String newText) {
		applicationPane.getStylesheets().clear();
		applicationPane.getStylesheets().add(getClass().getResource(css).toExternalForm());
		toggleThemeBtn.setText(newText);
	}

	void updateHighlight() {
		// Update the highlighting
		try {
			highlighting.updateHighlighting();
		} catch (Exception ignored) {}

		try {
			traceTab.updateHighlighting();
		} catch (Exception ignored) {}
	}

	AnalyseProtocol getAp() {
		return ap;
	}
}


