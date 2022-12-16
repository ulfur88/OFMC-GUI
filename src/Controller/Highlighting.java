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

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import Model.Parser.AST;
import Model.Parser.Option;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Highlighting {

    private SimpleTab simpleBase;
    private DiagramTab diagramBase;
    private SimpleTab simpleLink;
    private DiagramTab diagramLink;
    private TraceTab traceTab;
    private List<Label> simpleConnection;
    private List<VBox> diagramConnection;
    private List<List<Label>> traceSimpleConnection;
    private List<List<VBox>> traceDiagramConnection;
    private List<Label> simpleSteps;
    private List<VBox> diagramSteps;
    private List<Button> traceSteps;
    private List<AST> actions;
    private List<Option> traceActions;

    Highlighting(SimpleTab simpleBase, DiagramTab diagramBase, SimpleTab simpleLink, DiagramTab diagramLink) {
        // Initialisation of variables
        this.simpleBase = simpleBase;
        this.diagramBase = diagramBase;
        this.simpleLink = simpleLink;
        this.diagramLink = diagramLink;
        simpleConnection = new ArrayList<>();
        diagramConnection = new ArrayList<>();
        simpleSteps = simpleBase.getSteps();
        diagramSteps = diagramBase.getSteps();
        actions = simpleBase.getActions();

        // Create the highlighting
        initHighlighting();
    }

    Highlighting(TraceTab traceTab, SimpleTab simpleLink, DiagramTab diagramLink) {
        // Initializing the variables
        this.traceTab = traceTab;
        this.simpleLink = simpleLink;
        this.diagramLink = diagramLink;
        traceSteps = traceTab.getTraceButtons();
        traceSimpleConnection = new ArrayList<>();
        traceDiagramConnection = new ArrayList<>();
        traceActions = traceTab.getTracer().getOptions();
    }

    void updateHighlighting() {
        // Clearing the area
        simpleConnection.clear();
        diagramConnection.clear();

        // Update
        initHighlighting();
    }

    private void initHighlighting() {

        // Update hovering
        for (int i = 0; i < actions.size(); i++) {
            addStepLinks(actions.get(i).toString(), false);
            hoveringHighlight(simpleSteps.get(i), diagramSteps.get(i), simpleBase.isProtocol());
        }

        for (int i = 0; i < simpleConnection.size(); i++) {
            hoveringHighlight(simpleConnection.get(i), diagramConnection.get(i), simpleLink.isProtocol());
        }
    }

    private void addStepLinks(String action, boolean isTrace) {

        // Initialize pattern and mather for getting step links
        Pattern pattern = Pattern.compile("step(\\d),");
        Matcher matcher = pattern.matcher(action);

        List<Label> labels = new ArrayList<>();
        List<VBox> vBoxes = new ArrayList<>();

        // Find the step to link
        while (matcher.find()) {
            int step = Integer.parseInt(matcher.group(1));

            // Get label for the linked step and add it to link connections
            Label label = simpleLink.getSteps().get(step-1);
            VBox vBox = diagramLink.getSteps().get(step-1);

            if (isTrace) {
                labels.add(label);
                vBoxes.add(vBox);
            } else {
                simpleConnection.add(label);
                diagramConnection.add(vBox);
            }
        }
        if (isTrace) {
            traceSimpleConnection.add(labels);
            traceDiagramConnection.add(vBoxes);
        }

    }

    private void hoveringHighlight(Label label, VBox vBox, boolean isProtocol) {
        // Register start of hovering
        label.setOnMouseEntered(mouseEvent -> {
            label.setId("hover-highlight");
            vBox.setId("hover-highlight");
            linkHighlighting(label, vBox, isProtocol);
        });

        // Register end of hovering
        label.setOnMouseExited(mouseEvent -> {
            label.setId("action");
            vBox.setId("diagramActionBox");
            linkHighlighting(label, vBox, isProtocol);
        });

        // Register start of hovering
        vBox.setOnMouseEntered(mouseEvent -> {
            label.setId("hover-highlight");
            vBox.setId("hover-highlight");
            linkHighlighting(label, vBox, isProtocol);
        });

        // Register end of hovering
        vBox.setOnMouseExited(mouseEvent -> {
            label.setId("action");
            vBox.setId("diagramActionBox");
            linkHighlighting(label, vBox, isProtocol);
        });
    }

    private void linkHighlighting(Label label, VBox vBox, boolean isProtocol) {
        // Check if protocol and other tab is loaded
        if (isProtocol) {
            // Search for current step in the step connection list
            for (int i = 0; i < simpleConnection.size(); i++) {

                // If the step is found then add/remove highlighting
                if (simpleConnection.get(i).equals(label)) {
                    simpleBase.getSteps().get(i).setId(label.getId());
                    diagramBase.getSteps().get(i).setId(vBox.getId());
                }
            }
        }
        // Else if it is not the protocol then just add/remove the highlighting
        else {
            if (simpleSteps.indexOf(label)< simpleConnection.size()) {
                simpleConnection.get(simpleSteps.indexOf(label)).setId(label.getId());
                diagramConnection.get(diagramSteps.indexOf(vBox)).setId(vBox.getId());
            }
        }
    }

    void updateTracerLink() {
        // Clear the connections
        traceSimpleConnection.clear();
        traceDiagramConnection.clear();
        traceActions = traceTab.getTracer().getOptions();

        // update the hovering
        for (int i = 0; i < traceActions.size(); i++) {
            addStepLinks(traceActions.get(i).toString(), true);
            traceHoveringHighlight(traceSteps.get(i),traceSimpleConnection.get(i), traceDiagramConnection.get(i));
        }
    }

    private void traceHoveringHighlight(Node node, List<Label> labels, List<VBox> vBoxes) {
        // Register start of hovering
        node.setOnMouseEntered(mouseEvent -> {
            for (int i = 0; i < labels.size(); i++) {
                linkTraceHighlighting(labels.get(i), vBoxes.get(i), true);
            }
        });

        // Register end of hovering
        node.setOnMouseExited(mouseEvent -> {
            for (int i = 0; i < labels.size(); i++) {
                linkTraceHighlighting(labels.get(i), vBoxes.get(i), false);
            }
        });

        // Hovering over the connections
        for (Label label : labels) {

            label.setOnMouseEntered(e -> {
                label.setId("hover-highlight");
                for (int i = 0; i<traceSimpleConnection.size(); i++) {
                    if (traceSimpleConnection.get(i).contains(label)) {
                        traceSteps.get(i).setId("traceHover");
                    }
                }
            });

            label.setOnMouseExited(e-> {
                label.setId("action");
                for (int i = 0; i<traceSimpleConnection.size(); i++) {
                    if (traceSimpleConnection.get(i).contains(label)) {
                        traceSteps.get(i).setId("traceOptionButton");
                    }
                }
            });
        }

        for (VBox vBox : vBoxes) {
            vBox.setOnMouseEntered(e-> {
                vBox.setId("hover-highlight");
                for (int i = 0; i<traceDiagramConnection.size(); i++) {
                    if (traceDiagramConnection.get(i).contains(vBox)) {
                        traceSteps.get(i).setId("traceHover");
                    }
                }
            });
            vBox.setOnMouseExited(e-> {
                vBox.setId("diagramActionBox");
                for (int i = 0; i<traceDiagramConnection.size(); i++) {
                    if (traceDiagramConnection.get(i).contains(vBox)) {
                        traceSteps.get(i).setId("traceOptionButton");
                    }
                }
            });
        }
    }

    private void linkTraceHighlighting(Label label, VBox vBox, boolean isHovering) {
        if (isHovering) {
            label.setId("hover-highlight");
            vBox.setId("hover-highlight");
        } else {
            label.setId("action");
            vBox.setId("diagramActionBox");
        }
    }
}
