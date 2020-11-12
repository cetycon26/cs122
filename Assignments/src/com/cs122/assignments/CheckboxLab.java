package com.cs122.assignments;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class CheckboxLab extends VBox {
	private Text mainText;
	private CheckBox size24, size60, times, courier, yellow, white;
	
	public CheckboxLab() {
		Font font = new Font("Arial", 18);
		mainText = new Text("This is a text");
		mainText.setFill(Color.LIGHTGRAY);
		mainText.setFont(font);
		
		size24 = new CheckBox("24");
		size24.setStyle("-fx-background-color: white");
		size24.setAlignment(Pos.CENTER);
		size24.setOnAction(this:: processReturn);
		size60 = new CheckBox("60");
		size60.setStyle("-fx-background-color: white");
		size60.setAlignment(Pos.CENTER);
		size60.setOnAction(this:: processReturn);
		
		times = new CheckBox("Times");
		times.setStyle("-fx-background-color: white");
		times.setAlignment(Pos.CENTER);
		times.setOnAction(this:: processReturn);
		courier = new CheckBox("Courier");
		courier.setStyle("-fx-background-color: white");
		courier.setAlignment(Pos.CENTER);
		courier.setOnAction(this:: processReturn);
		
		yellow = new CheckBox("Yellow");
		yellow.setStyle("-fx-background-color: white");
		yellow.setAlignment(Pos.CENTER);
		yellow.setOnAction(this:: processReturn);
		white = new CheckBox("White");
		white.setStyle("-fx-background-color: white");
		white.setAlignment(Pos.CENTER);
		white.setOnAction(this:: processReturn);
		
		HBox sizes = new HBox(size24, size60);
		sizes.setAlignment(Pos.CENTER);
        sizes.setSpacing(20);
		HBox fonts = new HBox(times, courier);
		fonts.setAlignment(Pos.CENTER);
        fonts.setSpacing(20);
		HBox colors = new HBox(yellow, white);
		colors.setAlignment(Pos.CENTER);
        colors.setSpacing(20);
		
        setSpacing(20);  // between the text and the check boxes
        getChildren().addAll(mainText, sizes, fonts, colors);
	}
	
	public void processReturn(ActionEvent event) {
		String family = new String("Arial");
		Double size = new Double(18);
		mainText.setFill(Color.LIGHTGRAY);
		if(size24.isSelected())
			size = 24.0;
		if(size60.isSelected())
			size = 60.0;
		if(times.isSelected())
			family = new String("Times New Roman");
		if(courier.isSelected())
			family = new String("Courier New");
		if(yellow.isSelected())
			mainText.setFill(Color.YELLOW);
		if(white.isSelected())
			mainText.setFill(Color.WHITE);

		mainText.setFont(new Font(family, size)); 
		
	}
}
