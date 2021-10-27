/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.util.*;

/**
 *
 * @author Zack
 * Generate random password with a length of 7 characters with 
 * both upper and lowercase characters, numbers, and symbols
 */
public class PasswordGenerator {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        // ArrayList of upperCaseCharacters
        ArrayList<Character> upperCaseChar = new ArrayList<>();
        // ArrayList of lowerCaseCharacters
        ArrayList<Character> lowerCaseChar = new ArrayList<>();
        
        // Loop variable for alphabets
        char c;
        
        // Set c to "A" and have it loop through to "Z"
        for(c = 'A'; c <= 'Z'; ++c){
            // Add each character at "index" of "c" into ArrayList upperCaseChar
            upperCaseChar.add(c);
        }
        
        // Set c to "a" and have it loop through to "z"
        for(c = 'a'; c <= 'z'; ++c){
            // Add each character at "index" of "c" into ArrayList lowerCaseChar
            lowerCaseChar.add(c);
        }
        
        // Arraylist digits of type Integer
        ArrayList<Integer> digits = new ArrayList<>();
        
        // Add each digit from 1 - 9
        for(int i = 1; i < 10; i++){
            digits.add(i);
        }
        
        // Arraylist of symbols of type String
        ArrayList<String> symbols = new ArrayList<>();
        
        // I have absolutely no idea how to loop through to add these to symbols
        // So I add them all individually
        symbols.add("@");
        symbols.add("!");
        symbols.add("#");
        symbols.add("$");
        symbols.add("%");
        symbols.add("&");
        symbols.add("*");
        
        // ArrayList password of type object 
        // which can hold all of the strings, ints, and chars from each
        // type that we use for the password
        ArrayList<Object> password = new ArrayList<>();
        
        
        // Add 2 upperCaseChar, 1 lowerCaseChar, 2 symbols, and 1 digit to password ArrayList
        // All using methods from the CharacterGetter class, so we invoke the method on that class
        password.add(CharacterGetter.getRandomUpper(upperCaseChar));
        password.add(CharacterGetter.getRandomLower(lowerCaseChar));
        password.add(CharacterGetter.getRandomSymbol(symbols));
        password.add(CharacterGetter.getRandomNumber(digits));
        password.add(CharacterGetter.getRandomUpper(upperCaseChar));
        password.add(CharacterGetter.getRandomSymbol(symbols));
        
        // Shuffle (or randomize) the items in the ArrayList "password"
        Collections.shuffle(password);
        
        System.out.println("Your password is: " );   
        
        // Print out each object in ArrayList password
        for(int i = 0; i < password.size(); i++){
            System.out.print(password.get(i));
        }
        
        System.out.println();
        
    }
    
    
}
