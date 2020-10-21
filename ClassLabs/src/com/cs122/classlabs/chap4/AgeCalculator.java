package com.cs122.classlabs.chap4;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AgeCalculator extends GridPane{
	private TextField yob;
	private Label age;
	private Label exception;
	
	public AgeCalculator() {
		Font font = new Font(20);
		
		Label input = new Label("Year of Birth: ");
		input.setFont(font);
		GridPane.setHalignment(input, HPos.RIGHT);
		
		Label output = new Label("Age: ");
		output.setFont(font);
		GridPane.setHalignment(output, HPos.RIGHT);
		
		exception = new Label("");
    	exception.setFont(new Font(12));
    	GridPane.setHalignment(exception, HPos.RIGHT);
    	
		age = new Label("---");
		age.setFont(font);
		GridPane.setHalignment(age, HPos.CENTER);
		
		
		
		yob = new TextField();
		yob.setFont(font);
		yob.setPrefWidth(80);
		yob.setAlignment(Pos.CENTER);
        yob.setOnAction(this::processReturn);


        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: lavender");
        
        add(input, 0, 0);
        add(yob, 1, 0);
        add(output, 0, 1);
        add(age, 1, 1);
    	add(exception, 0, 2);

    }
	
	public void processReturn(ActionEvent event)
    {
        	int yobDate;
        	try{
        		yobDate = Integer.parseInt(yob.getText());
        		if(yobDate < 1920) {
            		exception.setText("Congrats! You've lived over 100 years!");
            		exception.setTextFill(Color.DARKGREEN);
            	}
            	else
            		exception.setText("");
        		age.setText(2020 - yobDate + "");
        	}
        	catch(NumberFormatException e) {
        		exception.setTextFill(Color.RED);
        		exception.setText("Please enter a valid number");
        		yob.clear();
        		age.setText("");
        	}
        	
        	

    }
        
	}

