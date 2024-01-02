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

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import Model.Parser.AST;

import java.util.ArrayList;
import java.util.List;

public class SimpleTab {

    private List<AST> actions;
    private boolean isProtocol;
    private List<Label> steps;

    @FXML
    private TextFlow textFlow;

    void initData(Controller controller, boolean isProtocol) {

        clearSimple();

        // Get actions
        if (isProtocol) {
            actions = controller.getAp().getActions();
        } else {
            try {
                actions = controller.getAp().getSimpleAnalysis();
            } catch (Exception e) {
                nothingToShow();
                return;
            }
        }
        if (actions.isEmpty()) nothingToShow();

        this.isProtocol = isProtocol;
        steps = new ArrayList<>();

        // Add steps to the text flow
        if (actions != null) {
            addSteps();
        }
    }

    void clearSimple() {
        textFlow.getChildren().clear();
    }

    void nothingToShow() {
        Label label = new Label("Nothing to show");
        label.setId("step");
        textFlow.getChildren().add(label);
    }

    private void addSteps() {
        int i = 1;
        for (AST action: actions) {
            // Add Step to the Text Flow
            addProtocolTextFlow("Step " + i++, "step");
            Label actionLabel = addProtocolTextFlow(action.toString().replaceAll("step" + "\\d" + ",",""), "action");

            // Save the step's action
            steps.add(actionLabel);
        }
    }

    private Label addProtocolTextFlow(String string, String id) {
        Label label;

        if (isProtocol) {
            // If protocol add the given string
            label = new Label(string);
        } else {
            // Else remove the step from the string
            label = new Label(string.replaceAll("step" + "\\d" + ",",""));
        }

        // Set layout attributes
        label.setId(id);
        label.setMaxWidth(textFlow.getWidth());

        // Add label to text flow
        textFlow.getChildren().addAll(label, new Text("\n"));

        return label;
    }

    List<Label> getSteps() {
        return steps;
    }

    void setActions(List<AST> actions) {
        this.actions = actions;
    }

    List<AST> getActions() {
        return actions;
    }

    boolean isProtocol() {
        return isProtocol;
    }

    TextFlow getTextFlow() {
        return textFlow;
    }
}