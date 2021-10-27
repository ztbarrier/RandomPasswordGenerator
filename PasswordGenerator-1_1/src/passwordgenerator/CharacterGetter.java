/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Zack
 */
public class CharacterGetter {
    
    // Getters for each random type of character 
    public static Character getRandomUpper(ArrayList<Character> upperCaseChar){
        // Choose random int from the ArrayList upperCaseChar
        int rnd = new Random().nextInt(upperCaseChar.size());
        return upperCaseChar.get(rnd);
    }
    
    public static Character getRandomLower(ArrayList<Character> lowerCaseChar){
        // Choose random int from the ArrayList lowerCaseChar
        int rnd = new Random().nextInt(lowerCaseChar.size());
        return lowerCaseChar.get(rnd);
    }
    
    public static String getRandomSymbol(ArrayList<String> symbols){
        // Choose random int from the ArrayList symbols
        int rnd = new Random().nextInt(symbols.size());
        return symbols.get(rnd);
    }
    
    public static int getRandomNumber(ArrayList<Integer> digits){
        // Choose random int from the ArrayList digits
        int rnd = new Random().nextInt(digits.size());
        return digits.get(rnd);
    }
    
    
}
