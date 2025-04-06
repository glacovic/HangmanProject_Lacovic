/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basichangmangame;

/**
 * GuessedLetter superclass, of CorrectLetter and WrongLetter subclasses
 * @author lacovic
 * 
 * Abstract class with letterGuess, constructor, and newDisplay
 */
public abstract class GuessedLetter 
{
    protected char letterGuess;
    
    //Constructor: Sets the letterGuess from HangmanGame
    public GuessedLetter(char letter) {
        letterGuess = letter;
    }
    
    //Subclasses must override and define the newDisplay method
    public abstract String newDisplay();
    //Body is different based on if letter guess is Correct or Wrong
}
