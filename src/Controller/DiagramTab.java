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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import Model.Parser.AST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagramTab {

    private HBox diagramLines;
    private VBox diagramActionsBox;
    private List<String> agents;
    private List<AST> actions;
    private double PREF_WIDTH = 150;
    private int agentCounter;
    private int actionCounter;
    private boolean initialized;
    private List<VBox> steps;
    private Boolean[] diagramFilterValues = {true, true};
    private Controller controller;

    @FXML
    private HBox diagramFilter, diagramAgents;

    @FXML
    private StackPane diagramActions;

    void initData(Controller controller, boolean isProtocol) {

        this.controller = controller;
        steps = new ArrayList<>();
        agents = new ArrayList<>();
        actions = new ArrayList<>();
        diagramLines = (HBox) diagramActions.getChildren().get(0);
        diagramLines.setId("diagramHLine");
        diagramActionsBox = (VBox) diagramActions.getChildren().get(1);
        diagramActionsBox.setId("diagramActionBox");
        initialized = false;
        agentCounter = 0;
        actionCounter = 0;

        clearDiagram();

        // Get the agents and actions
        if (isProtocol) {
            agents = Arrays.asList(controller.getAp().getAgents().split("[,;]"));
            actions = controller.getAp().getActions();
        } else {
            try {
                getAttackTraceAgents(controller);
            } catch (Exception e) {
                nothingToShow();
                return;
            }
        }
        initDiagram();
    }

    void clearDiagram() {
        diagramAgents.getChildren().clear();
        diagramLines.getChildren().clear();
        diagramActionsBox.getChildren().clear();
    }

    void nothingToShow() {
        Label label = new Label("Nothing to show");
        label.setId("step");
        diagramAgents.getChildren().add(label);
    }

    private void getAttackTraceAgents(Controller controller) {
        actions = controller.getAp().getSimpleAnalysis();
        if (actions.isEmpty()) {
        	nothingToShow();
        }
        for (AST action : actions) {
            String[] split = action.toString().replaceAll(" ", "").split("->|:");
            if (!agents.contains(split[0])) {
                agents.add(split[0]);
            }
            if (!agents.contains(split[1])) {
                agents.add(split[1]);
            }
        }
    }

    private void initDiagram() {

        if (!initialized) {
            diagramAgents.setId("diagramActionBox");

            // Add labels for the agents
            for (String agent : agents) {
                addAgent(agent);
            }
            // Add extra space at the end
            addAgent(null);

            initialized = true;
        } else {
            actionCounter = 0;
            diagramActionsBox.getChildren().clear();
            steps.clear();
        }

        setDiagramFilter();

        // Add actions between the agents
        for (AST action : actions) {
            addAction(Arrays.asList(action.toString().replaceAll(" ", "").split("->|:")));
        }
    }

    private void setDiagramFilter() {

        for (int i = 0; i < diagramFilter.getChildren().size(); i++) {
            CheckBox checkBox = (CheckBox) diagramFilter.getChildren().get(i);
            diagramFilterValues[i] = checkBox.isSelected();
        }
    }

    private void addAgent(String agent) {
        Label agentLabel = new Label();
        agentLabel.setId("diagramLabel");

        // Add the agent to the diagram
        if (agent != null) {
            agentLabel.setText(agent);
            VBox iVBox = new VBox(new Label());
            iVBox.setId("diagramLine");
            diagramLines.getChildren().add(agentCounter, iVBox);
            agentCounter++;
        }
        diagramAgents.getChildren().add(agentLabel);
    }

    private void addAction(List<String> action) {

        // Get the names of the interacting agents
        int index1 = getIndex(action, 0);
        int index2 = getIndex(action, 1);

        // Get the min and max index values
        int minIndex = Math.min(index1,index2);

        // Get length for the action label
        int length = Math.abs(index1-index2);

        HBox diagramAction = new HBox();
        diagramAction.setId("diagramActionBox");

        if (minIndex > 0) {
            addSpace(diagramAction, minIndex);
        }

        // Add the action to the diagram
        VBox actionBox = new VBox();
        actionBox.setId("diagramActionBox");
        actionBox.setMaxWidth(length*PREF_WIDTH-2);

        if (diagramFilterValues[0]) {
            actionBox.getChildren().add(makeActionLabel(action, "Step " + ++actionCounter));
        }

        if (diagramFilterValues[1]) {
            actionBox.getChildren().add(makeActionLabel(action, action.get(2).replaceAll("step" + "\\d" + ",","")));
        }

        actionBox.getChildren().add(getArrow(action, length));

        steps.add(actionBox);

        diagramAction.getChildren().add(actionBox);

        addSpace(diagramAction, (agentCounter-length-minIndex));

        diagramActionsBox.getChildren().add(diagramAction);
    }

    private Label makeActionLabel(List<String> action, String text) {
        Label actionLabel = new Label(text);
        actionLabel.setId("diagramAction");
        VBox.setVgrow(actionLabel,Priority.ALWAYS);
        actionLabel.setTooltip(new Tooltip(action.get(2).replaceAll("step" + "\\d" + ",","")));
        return actionLabel;
    }

    private void addSpace(HBox box, int length) {

        for (int i = 0; i <length; i++) {
            Label space = new Label();
            space.setId("diagramLabel");
            box.getChildren().add(space);
        }
    }

    private int getIndex(List<String> action, int index) {
        return agents.indexOf(action.get(index));
    }

    private HBox getArrow(List<String> action, int length) {

        HBox completeArrow = new HBox();
        completeArrow.setSpacing(2);

        // Get arrow lines
        for (int i = 1; i < length; i++) {
            ImageView line = new ImageView(new Image(getClass().getResourceAsStream("/Resources/arrow_line_light.png")));
            line.setFitWidth(PREF_WIDTH-2);
            completeArrow.getChildren().add(line);
        }

        ImageView arrow = new ImageView(new Image(getClass().getResourceAsStream(
                getIndex(action,0) < getIndex(action, 1)
                        ? "/Resources/arrow_right_light.png"
                        : "/Resources/arrow_left_light.png"
        )));

        arrow.setFitWidth(PREF_WIDTH-2);

        // Check the direction of the arrow
        if (getIndex(action,0) < getIndex(action, 1)) {
            arrow.setFitWidth(PREF_WIDTH-2);
            completeArrow.getChildren().add(arrow);
        } else {
            arrow.setFitWidth(PREF_WIDTH-2);
            completeArrow.getChildren().add(0,arrow);
        }
        return completeArrow;
    }

    List<VBox> getSteps() {
        return steps;
    }

    @FXML
    private void applyFilter() {
        // Apply filter to diagram area
        initDiagram();

        controller.updateHighlight();
    }

    List<AST> getActions() {
        return actions;
    }
}
