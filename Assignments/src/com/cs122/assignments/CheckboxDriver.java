package com.cs122.assignments;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckboxDriver extends Application{
	
	public void start(Stage primaryStage) {
		CheckboxLab pane = new CheckboxLab();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: black");
        
        Scene scene = new Scene(pane, 400, 250);
        
        primaryStage.setTitle("Style Options");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
