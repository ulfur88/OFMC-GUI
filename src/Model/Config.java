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

package Model;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Pair;

public class Config {

	private int numSess, depth;
	private String location, OS;
	private File file;
	private boolean depthChanged;

	public Config() {
		this.numSess = 2;
		this.depth = 0;
		this.OS = System.getProperty("os.name");
		this.location = System.getProperty("user.dir");
		if(OS.contains("Win"))location.replaceAll("\\\\","\\\\\\\\");
		this.depthChanged = false;
	}

	public List<String> getConfigs() {
		List<String> configs = new ArrayList<String>();
		String s = "";
		String dep = "";
		if (this.OS.contains("Win")) s = "--numSess " + Integer.toString(numSess);
		else s = Integer.toString(numSess);
		if (depth != 0) {
			if (this.OS.contains("Win")) s = s + " --depth " + depth;
			else dep = Integer.toString(depth);
		}
		configs.add(s);
		configs.add(location);
		configs.add(dep);
		return configs;
	}

	public String getLocation() {
		return this.location;
	}

	// The configuration window
	public void sConfig() {
		Dialog<Pair<String, String>> dialog = new Dialog<>();
		dialog.setTitle("Configurations");
		dialog.setHeaderText(null);
		ButtonType buttonSave = new ButtonType("Save", ButtonData.OK_DONE);
		dialog.getDialogPane().getButtonTypes().addAll(buttonSave, ButtonType.CANCEL);
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(20, 150, 10, 10));
		TextField numberofs = new TextField();
		numberofs.setText("" + numSess);
		numberofs.setPromptText("" + numSess);
		TextField dep = new TextField();
		String d = "" + depth;
		if (!depthChanged || depth == 0) d = "Infinite";
		dep.setPromptText(d);
		dep.setText(d);
		gp.add(new Label("Number of sessions:"), 0, 0);
		gp.add(numberofs, 1, 0);
		gp.add(new Label("Depth (Set to 0 for infinite):"), 0, 1);
		gp.add(dep, 1, 1);
		Node savebutton = dialog.getDialogPane().lookupButton(buttonSave);
		savebutton.setDisable(true);
		numberofs.textProperty().addListener((observable, oldValue, newValue) -> {
			if(numberofs.getText().equals("") || !notNeg(numberofs.getText()) || numberofs.getText().equals("0") || dep.getText().equals("") || !notNeg(dep.getText())) savebutton.setDisable(true);
			else savebutton.setDisable(!notNeg(numberofs.getText()));
		});
		dep.textProperty().addListener((observable, oldValue, newValue) -> {
			if(numberofs.getText().equals("") || !notNeg(numberofs.getText()) || numberofs.getText().equals("0") || dep.getText().equals("") || !notNeg(dep.getText())) savebutton.setDisable(true);
			else savebutton.setDisable(!notNeg(dep.getText()));
		});
		dialog.getDialogPane().setContent(gp);
		dialog.setResultConverter(dialogButton -> {
			if (dialogButton == buttonSave) {
				return new Pair<>(numberofs.getText(), dep.getText());
			}
			return null;
		});

		Optional<Pair<String, String>> result = dialog.showAndWait();

		if (result.isPresent()){
			try {
				int temp = Integer.parseInt(numberofs.getText());
				numSess = temp;
				temp = Integer.parseInt(dep.getText());
				if (depth != temp) depthChanged = true;
				depth = temp;
			} catch (Exception e) {
				//				System.out.println("Error Message");
			}
		}
	}

	private boolean notNeg(String s) {
		if (s.equals("Infinite")) return true;
		try {
			int temp = Integer.parseInt(s);
			if (temp >= 0) return true;
		} catch (Exception e) {

		}
		return false;
	}

	// If ofmc is not located in the userdir this is called
	public void locateOFMC () {
		Label secondLabel = new Label("Please locate ofmc");
		StackPane secondaryLayout = new StackPane();
		secondaryLayout.getChildren().add(secondLabel);
		Scene secondScene = new Scene(secondaryLayout, 600, 400);
		Stage newWindow = new Stage();
		newWindow.setTitle("Locate OFMC");
		newWindow.setScene(secondScene);
		HBox hbox = new HBox();
		VBox root = new VBox();
		TextField tinput = new TextField(this.location);
		hbox.getChildren().add(tinput);
		Button browse = new Button("Browse");

		browse.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				FileChooser chooser = new FileChooser();
				file = chooser.showOpenDialog(null);
				tinput.setText(file.getAbsolutePath());
				tinput.autosize();
			}
		});

		hbox.getChildren().add(browse);
		root.getChildren().add(hbox);
		hbox = new HBox();
		Button ok = new Button("OK");
		ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				location = file.getAbsolutePath().substring(0,file.getAbsolutePath().lastIndexOf(File.separator));
				if(OS.contains("Win"))location = location.replaceAll("\\\\","\\\\\\\\");
				newWindow.close();
			}
		});

		hbox.getChildren().add(ok);
		Button cancel = new Button("Cancel");
		cancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				newWindow.close();
			}
		});

		hbox.getChildren().add(cancel);
		root.getChildren().add(hbox);
		secondScene.getWindow().sizeToScene();
		secondScene.setRoot(root);
		newWindow.show();
		newWindow.toFront();
	}

	// Check if ofmc is located in userdir
	public boolean locationCheck() {
		File file;
		if (this.OS.startsWith("Win")) file =  new File(location + "\\\\ofmc.exe");
		else file =  new File(location + "/ofmc");
		return file.exists();
	}

}
