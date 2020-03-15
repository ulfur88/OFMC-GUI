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
package Pack;

import Controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

	Controller c;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/baseLayout.fxml"));
		Parent root = loader.load();
		primaryStage.setTitle("OFMC GUI");
		primaryStage.setScene(new Scene(root, 300, 275));
		primaryStage.setMaximized(true);
		c = loader.getController();

		primaryStage.setOnCloseRequest(event -> {
			c.promptSaveDialog();
			event.consume();
		});

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	
}