/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basichangmangame;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.FontWeight;
/**
 * If user chooses Multiplayer in the StartChoice
 * MultiPlayer class, for word choice, then leads to HangmanGame class
 * @author lacovic
 * 
 * User prompted to enter word or press button to choose word option
 * textEntered or pressedButton event leads to thirdStage and sceneThree
 * 
 * HangmanGame class starts after user chooses word
 * Six-letter word is used for the HangmanGame
 */
public class MultiPlayer extends GridPane
{
    private Label chooseWord;
    
    //Player can enter own word choice
    private TextField enterWord;

    //Buttons given for word options
    private Button word1, word2, word3, word4, word5, word6;
    private Button word7, word8, word9, word10, word11, word12;
    private Button word13, word14, word15, word16, word17, word18;
    
    private Stage thirdStage;
    private Scene sceneThree;
    
    
    public MultiPlayer()
    {
        Font font1 = Font.font("Helvetica", FontWeight.BOLD, 22);
        Font font2 = new Font("Arial", 20);
        
        //Prompts user to enter word or choose six-letter word from button
        chooseWord = new Label("Enter or choose six-letter word: ");
        chooseWord.setFont(font1);
        GridPane.setHalignment(chooseWord, HPos.CENTER);
        
        enterWord = new TextField();
        enterWord.setFont(font2);
        enterWord.setOnAction(this::textEntered);
        enterWord.setAlignment(Pos.CENTER);
        //HangmanGame is started with word entered in TextField
        
        //OR player chooses word from one of the buttons
        word1 = new Button("apples");
        word1.setFont(font2);
        word1.setStyle("-fx-background-color: peachpuff");
        word1.setOnAction(this::pressedButton);
        word1.setAlignment(Pos.CENTER);
        word1.setPrefWidth(100);
        word1.setPrefHeight(30);
        
        word2 = new Button("banana");
        word2.setFont(font2);
        word2.setStyle("-fx-background-color: peachpuff");
        word2.setOnAction(this::pressedButton);
        word2.setAlignment(Pos.CENTER);
        word2.setPrefWidth(100);
        word2.setPrefHeight(30);
        
        word3 = new Button("lemons");
        word3.setFont(font2);
        word3.setStyle("-fx-background-color: peachpuff");
        word3.setOnAction(this::pressedButton);
        word3.setAlignment(Pos.CENTER);
        word3.setPrefWidth(100);
        word3.setPrefHeight(30);
        
        word4 = new Button("orange");
        word4.setFont(font2);
        word4.setStyle("-fx-background-color: peachpuff");
        word4.setOnAction(this::pressedButton);
        word4.setAlignment(Pos.CENTER);
        word4.setPrefWidth(100);
        word4.setPrefHeight(30);
        
        word5 = new Button("cheese");
        word5.setFont(font2);
        word5.setStyle("-fx-background-color: peachpuff");
        word5.setOnAction(this::pressedButton);
        word5.setAlignment(Pos.CENTER);
        word5.setPrefWidth(100);
        word5.setPrefHeight(30);
        
        word6 = new Button("cashew");
        word6.setFont(font2);
        word6.setStyle("-fx-background-color: peachpuff");
        word6.setOnAction(this::pressedButton);
        word6.setAlignment(Pos.CENTER);
        word6.setPrefWidth(100);
        word6.setPrefHeight(30);
        
        word7 = new Button("cookie");
        word7.setFont(font2);
        word7.setStyle("-fx-background-color: moccasin");
        word7.setOnAction(this::pressedButton);
        word7.setAlignment(Pos.CENTER);
        word7.setPrefWidth(100);
        word7.setPrefHeight(30);
        
        word8 = new Button("raisin");
        word8.setFont(font2);
        word8.setStyle("-fx-background-color: moccasin");
        word8.setOnAction(this::pressedButton);
        word8.setAlignment(Pos.CENTER);
        word8.setPrefWidth(100);
        word8.setPrefHeight(30);
        
        word9 = new Button("carrot");
        word9.setFont(font2);
        word9.setStyle("-fx-background-color: moccasin");
        word9.setOnAction(this::pressedButton);
        word9.setAlignment(Pos.CENTER);
        word9.setPrefWidth(100);
        word9.setPrefHeight(30);
        
        word10 = new Button("potato");
        word10.setFont(font2);
        word10.setStyle("-fx-background-color: moccasin");
        word10.setOnAction(this::pressedButton);
        word10.setAlignment(Pos.CENTER);
        word10.setPrefWidth(100);
        word10.setPrefHeight(30);
        
        word11 = new Button("butter");
        word11.setFont(font2);
        word11.setStyle("-fx-background-color: moccasin");
        word11.setOnAction(this::pressedButton);
        word11.setAlignment(Pos.CENTER);
        word11.setPrefWidth(100);
        word11.setPrefHeight(30);
        
        word12 = new Button("pepper");
        word12.setFont(font2);
        word12.setStyle("-fx-background-color: moccasin");
        word12.setOnAction(this::pressedButton);
        word12.setAlignment(Pos.CENTER);
        word12.setPrefWidth(100);
        word12.setPrefHeight(30);
        
        word13 = new Button("muffin");
        word13.setFont(font2);
        word13.setStyle("-fx-background-color: bisque");
        word13.setOnAction(this::pressedButton);
        word13.setAlignment(Pos.CENTER);
        word13.setPrefWidth(100);
        word13.setPrefHeight(30);
        
        word14 = new Button("waffle");
        word14.setFont(font2);
        word14.setStyle("-fx-background-color: bisque");
        word14.setOnAction(this::pressedButton);
        word14.setAlignment(Pos.CENTER);
        word14.setPrefWidth(100);
        word14.setPrefHeight(30);
        
        word15 = new Button("garlic");
        word15.setFont(font2);
        word15.setStyle("-fx-background-color: bisque");
        word15.setOnAction(this::pressedButton);
        word15.setAlignment(Pos.CENTER);
        word15.setPrefWidth(100);
        word15.setPrefHeight(30);
        
        word16 = new Button("citrus");
        word16.setFont(font2);
        word16.setStyle("-fx-background-color: bisque");
        word16.setOnAction(this::pressedButton);
        word16.setAlignment(Pos.CENTER);
        word16.setPrefWidth(100);
        word16.setPrefHeight(30);
        
        word17 = new Button("chives");
        word17.setFont(font2);
        word17.setStyle("-fx-background-color: bisque");
        word17.setOnAction(this::pressedButton);
        word17.setAlignment(Pos.CENTER);
        word17.setPrefWidth(100);
        word17.setPrefHeight(30);
        
        word18 = new Button("onions");
        word18.setFont(font2);
        word18.setStyle("-fx-background-color: bisque");
        word18.setOnAction(this::pressedButton);
        word18.setAlignment(Pos.CENTER);
        word18.setPrefWidth(100);
        word18.setPrefHeight(30);
        //18 buttons given as other word options for HangmanGame
                
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(20);
        setStyle("-fx-background-color: powderBlue");
        
        //Prompts user to enter or select word choice
        add(chooseWord, 0, 0);
        
        //TextField for user to enter six-letter word
        add(enterWord, 0, 1);
        
        //Buttons with other word choices for HangmanGame
        add(word1, 1, 0);
        add(word2, 1, 1);
        add(word3, 1, 2);
        add(word4, 1, 3);
        add(word5, 1, 4);
        add(word6, 1, 5);
        
        add(word7, 2, 0);
        add(word8, 2, 1);
        add(word9, 2, 2);
        add(word10, 2, 3);
        add(word11, 2, 4);
        add(word12, 2, 5);
        
        add(word13, 3, 0);
        add(word14, 3, 1);
        add(word15, 3, 2);
        add(word16, 3, 3);
        add(word17, 3, 4);
        add(word18, 3, 5);
    } 
    
    
    //After user enters six-letter word, leads to HangmanGame class
    public void textEntered(ActionEvent event)
    {
        String gameWord;
        String input;
        
        //Verifies that input from text field is six-letter word
        if (enterWord.getText() != null) {
            input = enterWord.getText();
            int i;
            
            if (input.length() != 6) {
                chooseWord.setText("Enter or choose SIX-letter word: ");
                //When input is not 6 characters exactly
            }
            else {
                chooseWord.setText("Enter or choose six-letter word: ");
                
                int count = 0;
                for (i = 0; i < input.length(); i++) {
                    if (Character.isLetter(input.charAt(i))) {
                        ++count; 
                        //If all 6 characters are letters, count is 6
                    }
                }
                
                if (count == 6) {
                    gameWord = input;
                    //Six-letter word from input becomes gameWord
                    
                    //leads to thirdStage sceneThree (HangmanGame)
                    thirdStage = new Stage();
                    HangmanGame game = new HangmanGame();
                    sceneThree = new Scene(game, 925, 750);
                    
                    game.userWord(gameWord);
                    //gameWord is used as userWord parameter for HangmanGame

                    thirdStage.setTitle("Basic Hangman Game");
                    thirdStage.setScene(sceneThree);
                    thirdStage.show();
                }
                else {
                    chooseWord.setText("Enter or choose six-LETTER word: ");
                    //If count is not 6, not all characters are letters
                }
            }
        }  
    }
    
    
    //After user presses button, leads to HangmanGame class
    public void pressedButton(ActionEvent event)
    {
        String gameWord;
        //Word choice from button becomes gameWord
        
        
        //Determines which of the 18 buttons was pressed
        //Six-letter word on one of the buttons becomes gameWord 
        if (event.getSource() == word1)
            gameWord = word1.getText();
        else if (event.getSource() == word2)
            gameWord = word2.getText();
        else if (event.getSource() == word3)
            gameWord = word3.getText();
        else if (event.getSource() == word4)
            gameWord = word4.getText();
        else if (event.getSource() == word5)
            gameWord = word5.getText();
        else if (event.getSource() == word6)
            gameWord = word6.getText();
        else if (event.getSource() == word7)
            gameWord = word7.getText();
        else if (event.getSource() == word8)
            gameWord = word8.getText();
        else if (event.getSource() == word9)
            gameWord = word9.getText();
        else if (event.getSource() == word10)
            gameWord = word10.getText();
        else if (event.getSource() == word11)
            gameWord = word11.getText();
        else if (event.getSource() == word12)
            gameWord = word12.getText();
        else if (event.getSource() == word13)
            gameWord = word13.getText();
        else if (event.getSource() == word14)
            gameWord = word14.getText();
        else if (event.getSource() == word15)
            gameWord = word15.getText();
        else if (event.getSource() == word16)
            gameWord = word16.getText();
        else if (event.getSource() == word17)
            gameWord = word17.getText();
        else 
            gameWord = word18.getText();   
        
        
        //leads to thirdStage sceneThree (HangmanGame)
        thirdStage = new Stage();
        HangmanGame game = new HangmanGame();
        sceneThree = new Scene(game, 925, 750);
        
        game.userWord(gameWord);
        //gameWord is used as parameter for userWord method in HangmanGame
        
        thirdStage.setTitle("Basic Hangman Game");
        thirdStage.setScene(sceneThree);
        thirdStage.show();
    }   
    
    
}
