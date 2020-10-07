package com.cs122.assignments;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Logo extends Application{
	public void start(Stage primaryStage) {
		
		Text toyota = new Text(115, 250, "Toyota");
		toyota.setFill(Color.RED);
		toyota.setStyle("-fx-font: 24 georgia;");
		
		
		Ellipse one = new Ellipse(150, 150, 100, 75);
		one.setFill(null);
		one.setStroke(Color.GRAY);
		one.setStrokeWidth(10);
		
		Ellipse two = new Ellipse(150, 150, 23, 70);
		two.setFill(null);
		two.setStroke(Color.GRAY);
		two.setStrokeWidth(8);
		
		Ellipse three = new Ellipse(150, 115, 85, 30);
		three.setFill(null);
		three.setStroke(Color.GRAY);
		three.setStrokeWidth(8);
		
		Ellipse four = new Ellipse(150, 110, 85, 30);
		four.setFill(null);
		four.setStroke(Color.GRAY);
		four.setStrokeWidth(8);
		
		Group root = new Group(one, two, three, four, toyota);
		Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
