package com.cs122.classlabs.chap4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AgeDisplay extends Application{

	public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new AgeCalculator(), 400, 200);
        
        primaryStage.setTitle("Age Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}

}
