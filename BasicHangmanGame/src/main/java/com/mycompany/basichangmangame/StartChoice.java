package com.mycompany.basichangmangame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
/**
 * StartChoice class, for start choice of Single player or Multiplayer game
 * @author lacovic
 * 
 * "Single player" button leads to SinglePlayer class
 * "Multiplayer" button leads to MultiPlayer class
 * 
 * Both buttons lead to a secondStage and sceneTwo
 */
public class StartChoice extends Application
{
    private Text startText;
    private Stage secondStage;
    private Scene sceneTwo;
    
    @Override
    public void start(Stage primaryStage)
    {
        Font font1 = Font.font("Arial", FontWeight.BOLD, 22);
        startText = new Text ("Choose game to start: ");
        startText.setFont(font1);
        //Prompts user to press "Single player" or "Multiplayer" button
        
        Font font2 = new Font(18);
        Button single = new Button("Single player");
        single.setStyle("-fx-background-color: lavender");
        single.setOnAction(this::singleButtonPress);
        single.setFont(font2);
        single.setPrefWidth(130);
        single.setPrefHeight(40);
        //"Single player" button, when pressed ActionEvent singleButtonPress
        
        Button multi = new Button("Multiplayer");
        multi.setStyle("-fx-background-color: powderBlue");
        multi.setOnAction(this::multiButtonPress);
        multi.setFont(font2);
        multi.setPrefWidth(130);
        multi.setPrefHeight(40);
        //"Multiplayer" button, when pressed ActionEvent multiButtonPress
        
        FlowPane pane = new FlowPane(startText, single, multi);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: lightPink");
        
        Scene scene = new Scene(pane, 750, 450);
        
        primaryStage.setTitle("Start Choice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
   
    /* Either button being pressed leads
    to the secondStage and sceneTwo */
    
    //Press of "Single player" button leads to SinglePlayer class
    public void singleButtonPress(ActionEvent event)
    {
        secondStage = new Stage();
        sceneTwo = new Scene(new SinglePlayer(), 750, 450);
        secondStage.setTitle("Single player");
        secondStage.setScene(sceneTwo);
        secondStage.show(); 
    }
    
    //Press of "Multiplayer" button leads to MultiPlayer class
    public void multiButtonPress(ActionEvent event)
    {
        secondStage = new Stage();
        sceneTwo = new Scene(new MultiPlayer(), 850, 550);
        secondStage.setTitle("Multiplayer");
        secondStage.setScene(sceneTwo);
        secondStage.show();
    }
    
    
    
    public static void main(String[] args) 
    {
        launch(args);
    }

}
