/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package com.mycompany.basichangmangame;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
/**
 * HangmanGame class, after user chooses SinglePlayer or MultiPlayer, 
 * and word is selected for game (either randomly or chosen)
 * 
 * Basic Hangman Game
 * @author lacovic
 * 
 * Hangman game that will display the guessed letters from user
 * 
 * After correct guess, letter in gameWord is shown in displayWord Label
 * After wrong guess, letter shown and StickMan figure that has added part
 * 
 * Game ends from either correctly guessed word, or 7 wrong guessed letters
 */

public class HangmanGame extends GridPane
{
    private Label incorrect;
    private Circle head;
    private Label body, legs;
    private Label displayWord, enterLabel, confirm;
    private Button yesButton;
    private TextField letter;
    private String gameWord, currentWord, input;
    private char letterGuess;
    private int num = 0;
    
    public HangmanGame()
    {
        Font font1 = Font.font("Helvetica", FontWeight.BOLD, 50);
        Font font2 = new Font(28);
        Font font3 = new Font(30);
        Font font4 = Font.font("Arial", FontWeight.BOLD, 26);
        Font font5 = new Font(32);
        
        
        Label showLetters = new Label("(MAX 7 WRONG)\nIncorrect Letters: ");
        showLetters.setFont(font2);
        GridPane.setHalignment(showLetters, HPos.CENTER);
        
        //Shows incorrect letter guesses
        incorrect = new Label("");
        incorrect.setFont(font3);
        GridPane.setHalignment(incorrect, HPos.CENTER);
               
        
        //Displays the StickMan figure, updated after each wrong guess
        head = new Circle(60);
        head.setFill(null);
        
        body = new Label("");
        body.setFont(font4);
        
        legs = new Label("");
        legs.setFont(font4);

        
        //Displays the gameWord with each correct letter guess
        displayWord = new Label("------");
        displayWord.setFont(font1);
        GridPane.setHalignment(displayWord, HPos.CENTER);

        
        //Prompts user to enter their choice of letter
        enterLabel = new Label("Enter one letter: ");
        enterLabel.setFont(font5);
        GridPane.setHalignment(enterLabel, HPos.CENTER);
        
        //TextField for user to input letter guess
        letter = new TextField();
        letter.setFont(font2);
        letter.setPrefWidth(70);
        letter.setAlignment(Pos.CENTER);
        letter.setOnAction(this::letterGuess);
        
        
        //Asks user to confirm their letter guess
        confirm = new Label("Confirm Letter Guess of [  ]?");
        confirm.setFont(font4);
        GridPane.setHalignment(confirm, HPos.CENTER);
        
        //User presses YES button to confirm guess
        yesButton = new Button("YES");
        yesButton.setStyle("-fx-background-color: HOTPINK");
        yesButton.setTextFill(Color.WHITE);
        yesButton.setFont(font4);
        yesButton.setOnAction(this::confirmedPress);
        yesButton.setAlignment(Pos.CENTER);
        yesButton.setPrefWidth(90);
        yesButton.setPrefHeight(30);
        
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(20);
        setStyle("-fx-background-color: honeydew");
        
        add(showLetters, 0, 0);
        add(incorrect, 0, 1);
        
        add(head, 1, 0);
        add(body, 1, 1);
        add(legs, 1, 2);
        
        add(displayWord, 0, 4);
        add(enterLabel, 0, 5);
        add(letter, 1, 5);
        
        add(confirm, 0, 6);
        add(yesButton, 1, 6);
    }
    
    
    /* Word selected randomly (SinglePlayer) or chosen (MultiPlayer)
    becomes the gameWord to be used for the HangmanGame */
    public void userWord(String word)
    {
        gameWord = word.toUpperCase();
    }
    
    
    //After user inputs their letter guess in text field
    public void letterGuess(ActionEvent event)
    {
        if (enterLabel.getText().equals("GAME LOST") != true) {
            input = letter.getText();
            int i = 0;
            
            //Checks to make sure input is only one single letter
            if (input.length() > 1) {
                enterLabel.setText("Enter ONE letter only: ");
            }
            else if (input.length() < 1) {
                enterLabel.setText("Enter one letter: ");
            }
            else {
                enterLabel.setText("Enter one letter: ");
                if (Character.isLetter(input.charAt(i))) {
                    input = input.toUpperCase();
                    letterGuess = input.charAt(i);
                    confirm.setText("Confirm Letter Guess of [ " + letterGuess + " ]?");
                    //If input is a single letter guess
                }
                else {
                    enterLabel.setText("Enter one LETTER: ");
                }
            }
        }
    }
    
    
    //After user presses YES to confirm letter guess
    public void confirmedPress(ActionEvent event)
    {
        int i;
        int count = 0;
        
        if (input != null && input.length() == 1) 
        {
            //Counts how many times letterGuess is in gameWord
            for (i = 0; i < gameWord.length(); i++) {
                if (gameWord.charAt(i) == letterGuess) {
                    ++count;
                }
            }
            
            //Based on count of letter in word, it is correct or wrong letter
            if (count > 0) {
                //Correct letter guess
                currentWord = displayWord.getText();
                CorrectLetter corLet = new CorrectLetter(letterGuess, gameWord, currentWord);
                String disWord = corLet.newDisplay();
                if (disWord.equals(gameWord)) {
                    //When display word is the same as gameWord
                    displayWord.setText(gameWord);
                    enterLabel.setText("GAME WON");
                    confirm.setText("Word was guessed correctly");
                    //User wins after all letters in gameWord are guessed
                }
                else {
                    displayWord.setText(disWord);
                    //Displays new current correct guesses of word
                }
            }
            else {
                //Wrong letter guess
                String incLets = incorrect.getText();
                WrongLetter wroLet = new WrongLetter(letterGuess, incLets);
                
                //If game is not over, and wrong letter not already guessed
                if (enterLabel.getText().equals("GAME LOST") != true && incLets.contains(input) != true)
                {
                    //Updates incorrect letters display
                    String newLets = wroLet.newDisplay();
                    incorrect.setText(newLets);
                    
                    //Keeps track of incorrect guesses number
                    if (num < 7) {
                        ++num;
                    }
                    
                    //Updates StickMan based on number of wrong guess
                    if (num == 1) {
                        head.setStroke(Color.BLACK);
                        //First incorrect guess adds head outline
                    }
                    else if (num > 1 && num <= 4) {
                        String stickBody = wroLet.StickMan(num);
                        body.setText(stickBody);
                        //Second to Fourth wrong guesses add body and arms
                    }
                    else if (num > 4 && num <= 6) {
                        String stickLegs = wroLet.StickMan(num);
                        legs.setText(stickLegs);
                        //Fifth to Sixth guesses add legs
                    }
                    else if (num == 7){
                        //Seventh and last incorrect guess fills head
                        if (head.getFill() == null) {
                            head.setFill(Color.HOTPINK);
                            //Player loses game when head turns pink
                        }
                        //Game over when number of incorrect guesses is 7
                        displayWord.setText("Word was: " + gameWord);
                        enterLabel.setText("GAME LOST");
                        confirm.setText("You failed to guess word");
                    }
                }
            }
        }
    }
    
    
    
}
