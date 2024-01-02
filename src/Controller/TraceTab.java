/*
 * BSD License
 *
 * Open Source Fixedpoint Model-Checker Graphical User Interface version 2019
 *
 * (C) Copyright Úlfur Jóhann Edvardsson 2019
 * (C) Copyright Veronica Julie Lodskov Hoffmann 2019
 *
 * All Rights Reserved.
 *
*/

package Controller;

import Model.Tracer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import Model.Parser.Option;

import java.util.ArrayList;
import java.util.List;

public class TraceTab {

    @FXML
    public Button backBtn, forwardBtn;

    @FXML
    public VBox traceOptions, traceHistory;

    private Tracer tracer;
    private List<Button> traceButtons;
    private List<Integer>  tracePath;
    private Highlighting highlighting;
    private int traceCounter = 0;

    void initData(SimpleTab simpleTab, DiagramTab diagramTab, Tracer tracer) {
        this.tracer = tracer;
        traceButtons = new ArrayList<>();
        highlighting = new Highlighting(this, simpleTab, diagramTab);
        tracePath = new ArrayList<>();

        showTracerOptions();
    }

    private void showTracerOptions() {
        // Clear the trace buttons
        if (!traceButtons.isEmpty() || !traceOptions.getChildren().isEmpty()) {
            traceButtons.clear();
            traceOptions.getChildren().clear();
        }

        List<Option> options = tracer.getOptions();

        // Add the buttons to the view
        for (int i = 0 ; i < options.size(); i++) {
            Button b = new Button(options.get(i).toString().replaceAll("step\\d,", ""));
            b.setId("traceOptionButton");

            Label label = new Label("Option " + (i + 1));
            label.setId("step");

            traceOptions.getChildren().addAll(label, b);
            traceButtons.add(b);

            traceButtonPressed(b, i);
        }
        updateHighlighting();
    }

    void updateHighlighting() {
        highlighting.updateTracerLink();
    }

    // Register button press
    private void traceButtonPressed(Button b, int i) {
        b.setOnAction(actionEvent -> {

            if (!forwardBtn.isDisabled()) {
                tracePath.subList(traceCounter, tracePath.size() - 1).clear();
            }
            tracePath.add(i);

            // Chosen tracing action
            tracer.addToStepsTaken(i, b.getText());
            tracer.runTrace();

            traceHistory.getChildren().add(new Label(tracer.getHistory().get(traceCounter)));
            traceCounter++;

            if (traceCounter > 0) {
                backBtn.setDisable(false);
            }
            forwardBtn.setDisable(true);

            generateTracerOptions();
        });
    }

    public void backTrace() {

        // Chosen tracing action
        tracer.removeStepTaken();
        tracer.runTrace();

        traceHistory.getChildren().remove(traceHistory.getChildren().size()-1);

        traceCounter--;

        if (traceCounter > 0) {
            backBtn.setDisable(false);
        } else {
            backBtn.setDisable(true);
        }
        forwardBtn.setDisable(false);

        try {
            showTracerOptions();
        } catch (Exception ignored) {
        }
    }

    public void forwardTrace() {

        int nextOption = tracePath.get(traceCounter);
        Button btn = (Button)traceOptions.getChildren().get(nextOption*2 + 1);

        // Chosen tracing action
        tracer.addToStepsTaken(nextOption, btn.getText());
        tracer.runTrace();

        traceHistory.getChildren().add(new Label(tracer.getHistory().get(traceCounter)));
        traceCounter++;

        if (traceCounter == tracePath.size()) {
            forwardBtn.setDisable(true);
        }
        backBtn.setDisable(false);

        generateTracerOptions();
    }

    private void generateTracerOptions() {
        try {
            showTracerOptions();
        } catch (Exception e) {
            traceButtons.clear();
            traceOptions.getChildren().clear();
            Label empty = new Label("End of trace");
            empty.setId("step");
            traceOptions.getChildren().add(empty);
        }
    }

    List<Button> getTraceButtons() {
        return traceButtons;
    }

    Tracer getTracer() {
        return tracer;
    }
}

