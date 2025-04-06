/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basichangmangame;

/**
 * WrongLetter child subclass, of GuessedLetter parent superclass
 * @author lacovic
 * 
 * Overrides and defines newDisplay method from GuessedLetter class
 * Wrong letter guess is displayed, added to incorrect Label in HangmanGame
 * 
 * Based on number of incorrect guess, updates StickMan figure
 * (The StickMan body/arms/legs, are added from wrong guesses 2 to 6)
 */
public class WrongLetter extends GuessedLetter
{
    private String incLets;
    
    //Constructor: Sets the incorrect letterGuess from HangmanGame
    public WrongLetter(char letter, String incLets)
    {
        super(letter);
        this.incLets = incLets;
    }
    
    //Getter method for the number and letters of incorrect guesses
    public String getLets() {
        return incLets;
    }
    
    
    //Overrides and defines newDisplay method, body for Wrong letter guess
    @Override
    public String newDisplay() 
    {
        int i;
        String incStr = "";
        int newLength = incLets.length() + 1;
        
        //Letter guess is added to string with incorrect letter guesses
        for (i = 0; i < newLength; ++i) {
            if (i == newLength - 1) {
                incStr += letterGuess + " ";
                //Letter is added to end of display incorrect letters string
            }
            else {
                incStr += incLets.charAt(i);
            }
        }
        
        return incStr;
        //Returns new String to display letters on incorrect Label
    }
    
    
    //Updates body, arms, or legs of StickMan figure in HangmanGame
    public String StickMan(int number)
    {
        String stickLabel = "";
        
        switch (number)
        {
            case 2: //Adds body to StickMan
                stickLabel = "        | \n        | \n        |";
                break;
            case 3: //Adds left arm to StickMan
                stickLabel = "  \\     | \n    \\   | \n        |";
                break;
            case 4: //Adds right arm to StickMan
                stickLabel = "  \\     |     / \n    \\   |   / \n        |";
                break;
            case 5: //Adds left leg to StickMan
                stickLabel = "     / \n   / ";
                break;
            case 6: //Adds right leg to StickMan
                stickLabel = "     /     \\\n   /        \\";
                break;
        }
        
        return stickLabel;
        //Returns String of updated body, arm, or leg part of StickMan
    }
    
    
}
