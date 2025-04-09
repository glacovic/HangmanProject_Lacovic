package com.mycompany.basichangmangame;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.FontWeight;
/**
 * If user chooses Single player in the StartChoice
 * SinglePlayer class, for starting HangmanGame with random word
 * @author lacovic
 * 
 * User prompted to press button for starting the game
 * startButton event leads to thirdStage and sceneThree
 * 
 * Six-letter word is randomly chosen from wordOptions class
 * The HangmanGame class is started with random word
 */
public class SinglePlayer extends GridPane
{
    private Label clickStart;
    private Button startButton;
    private Stage thirdStage;
    private Scene sceneThree;
    
    public SinglePlayer()
    {
        Font font1 = Font.font("Arial", FontWeight.BOLD, 24);
        Font font2 = new Font(26);
        Font font3 = new Font("Arial", 22);
        
        //Prompts user to press the button to start game
        clickStart = new Label("Click button to play hangman --> ");
        clickStart.setFont(font1);
        GridPane.setHalignment(clickStart, HPos.CENTER);
        
        //startButton or "Start Game" button to be pressed
        startButton = new Button("Start Game");
        startButton.setFont(font2);
        startButton.setStyle("-fx-background-color: lightYellow");
        startButton.setOnAction(this::startButtonPress);
        startButton.setAlignment(Pos.CENTER);
        startButton.setPrefWidth(180);
        startButton.setPrefHeight(50);
        
        Label goBack = new Label("(Press X to go back to start)");
        goBack.setFont(font3);
        GridPane.setHalignment(goBack, HPos.CENTER);
                
        setAlignment(Pos.CENTER);
        setHgap(10);
        setStyle("-fx-background-color: lavender");
        
        add(clickStart, 0, 0);
        add(startButton, 1, 0);
        add(goBack, 0, 1);
    }
    
    
    //After user presses the startGame button, leads to HangmanGame class
    public void startButtonPress(ActionEvent event)
    {
        String gameWord;
        //gameWord String is the word used in HangmanGame
        
        wordOptions option = new wordOptions();
        gameWord = option.randomWord();
        //Random word from wordOptions class becomes gameWord

        //leads to thirdStage sceneThree (HangmanGame)
        thirdStage = new Stage();
        HangmanGame game = new HangmanGame();
        sceneThree = new Scene(game, 1000, 800);
        
        game.userWord(gameWord);
        //gameWord is used as parameter for userWord method in HangmanGame
        
        thirdStage.setTitle("Basic Hangman Game");
        thirdStage.setScene(sceneThree);
        thirdStage.show();
    }
    
}
