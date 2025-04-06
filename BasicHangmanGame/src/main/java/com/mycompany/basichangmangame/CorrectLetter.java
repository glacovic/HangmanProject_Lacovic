/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basichangmangame;

/**
 * CorrectLetter child subclass, of GuessedLetter parent superclass
 * @author lacovic
 * 
 * Overrides and defines newDisplay method from GuessedLetter class
 * Correct letter guess is displayed, where it appears in gameWord
 */
public class CorrectLetter extends GuessedLetter
{
    private String gameWord;
    private String currentWord;
    
    /* Constructor: Sets up the correct letterGuess and gameWord, along with
    the currentWord of correct letter guesses displayed in HangmanGame */
    public CorrectLetter(char letter, String gameWord, String currentWord)
    {
        super(letter);
        this.gameWord = gameWord;
        this.currentWord = currentWord;
    }
    
    //Getters for gameWord and currentWord of HangmanGame
    public String getGame() {
        return gameWord;
    }
    public String getCurrent() {
        return currentWord;
    }
    
    
    //Overrides and defines newDisplay method, body for Correct letter guess
    @Override
    public String newDisplay() 
    {
        int i;
        String disWord = "";
                
        //Letter guess is added to string with current correct letter guesses
        for (i = 0; i < gameWord.length(); ++i) {
            if (gameWord.charAt(i) == letterGuess) {
                disWord += letterGuess;
                //Letter is added to current display word of correct letters
            }
            else {
                disWord += currentWord.charAt(i);
                //If character is not letter guess, it stays the same
            }
        }
        
        return disWord;
        //Returns new String for the displayWord Label of HangmanGame
    }
    
    
}
