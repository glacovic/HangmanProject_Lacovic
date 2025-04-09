/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basichangmangame;

/**
 * wordOptions class, for selecting random SinglePlayer word
 * @author lacovic
 * 
 * Randomly generate number from length of the wordsList
 * Random number becomes index of selected word
 * 
 * Word is then used in the SinglePlayer class
 * Selected word becomes gameWord of the HangmanGame
 */
import java.util.Random;
public class wordOptions 
{
    private final int NUM_WORDS;
    private final int RAN_NUM;
    private String wordSelected;
   
    public wordOptions()
    {
        //Six-letter word options in wordList to randomly select one from
        String[] wordsList = {"apples", "banana", "lemons", "cheese", "orange",
                    "cashew", "raisin", "cookie", "barley", "butter", "garlic", 
                    "hummus", "potato", "carrot", "sundae", "bitter", "pepper",
                    "muffin", "waffle", "yogurt", "sauces", "relish", "spoons",
                    "celery", "chives", "onions", "crunch", "citrus", "treats",
                    "cereal", "bagels", "cherry", "coffee", "napkin", "pickle",
                    "salami", "burger", "bucket", "smoked", "pearls", "turkey",
                    "chucky", "noodle", "octopi", "puddle", "zigzag", "random",
                    "sample", "nights", "ticket", "movies", "knight", "output",
                    "record", "radios", "turtle", "tigers", "sharks", "pebble"};
        
        NUM_WORDS = wordsList.length;
        //Length of wordsList becomes number for random generate
        
        Random generate = new Random();
        RAN_NUM = generate.nextInt(NUM_WORDS);
        //Random number is selected to be the index of random word
        
        wordSelected = wordsList[RAN_NUM];
        //wordSelected for HangmanGame is wordsList index of random number
    }
    
    
    //Random word selected is used for Single player HangmanGame
    public String randomWord()
    {
        String ranWord = wordSelected;
        return ranWord;
        //ranWord becomes gameWord in SinglePlayer class
        
    }
    
    
}
