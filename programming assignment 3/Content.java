/* Olujide Jacobs
 * CS 110 Programming Assignment 3
 * Section 4
 * 10/26/2012
 * Content.java
 */

/* This program should prompt the user to enter the name of a file, then count the number of words, integers and
   floating point numbers */

import java.io.*;  //import java.io.* for the exception that throws the error in the try-catch block
import java.util.Scanner; //import scanner

public class Content{ //define class
 public static int wordCount=0; //word count method
 public static int integerCount=0; //integer count method
 public static int floatCount=0; //floating point number count method
 
  public static void main(String[] args){ //start main
    
    Scanner in  = new Scanner(System.in); //new scanner in created
    
    boolean readfile = false; //readfile is initialized to false, this is the variable that validates the file name
    String filename; //filename reads in the content in the user's file to the program
    
     while (!readfile){ //while loop continues to evaluate if readfile is true
      
      System.out.println("Please enter the file name."); //prompt the user to enter the filename
      filename = in.next(); //read the filename into the programtyey
      
      try{ //try-catch block to throw up an error when the user enters an invalid file
        
        Scanner infile = new Scanner(new File(filename)); //new scanner infile created
        readfile = true; //readfile validates the user's input
        
        while(infile.hasNext()){ //while the contents in the file are read
       
          String input = infile.next(); //new input file
          check(input); //checks input value
        }
      }
      catch(FileNotFoundException e) //catch block to throw exception
      {
        System.out.println("Cannot find file."); //prints out the exception
        readfile = false; //readfile set to false to validate input
      }
    }
     System.out.println("There is(are) "+wordCount+" word(s) in your file"); //print out word count
     System.out.println("There is(are) "+integerCount+" integer(s) in your file"); //print out integer count
     System.out.println("There is(are) "+floatCount+" floating point number(s) in your file"); //print out float count
  } //end main
  
        public static boolean isWord(String filename){ //new method isWord
          boolean word = false; //word set to false to validate if the characters in the file are words
          for(int i = 0; i < filename.length(); i++) //for loop to get each character in the file
          if(Character.isLetter(filename.charAt(i)) && Character.isUpperCase(filename.charAt(i)) || Character.isLowerCase(filename.charAt(i))) //checks if the character in the file is a word in either upper or lowercase
               {
            return true; //returns true if it's a word
          }
          else //if thhese conditions are not met, it returns false
          {
            return false; //returns false
          }
          return word; //returns what word is whether true or false
        } //end method 1
                
        public static boolean isInteger(String filename){ //new method isInteger
          boolean number = false; //number set to false to validate if the characters in the file are integers
          
          for(int i = 0; i < filename.length(); i++) //for loop to get each character in the file
          if(Character.isDigit(filename.charAt(i))) //checks if the character in the file is a digit
          {
            number = true; //returns true if yes
            
          }
           else if(i==0 && (filename.charAt(0)=='+' || filename.charAt(0)=='-')) //neglects signs
          {
            number = true; //returns true if there is a sign
          }
          else if(filename.contains(".")) //checks if the digits contain a decimal
          {
            return false; //return false if yes, then it's not an integer
          }
          else //if not
          {
            return false; //returns false then the number is an integer
          }
         
          return number; //returns what number is, true or false
        } //end method 2 
        
        public static boolean isFloat(String filename){ //new method isFloat
          boolean float_number = false; //float_number set to false to validate if the characters in the file contain decimal
          int dotCount=0;
          int length; //find the length of the character being read
          length = filename.length()-1; //finds the length of the character
          boolean endsWithDot=(length==filename.indexOf("."));
          int i=0;
          while(i<length && !endsWithDot) {//for loop to determine each character
          if(Character.isDigit(filename.charAt(i))) //checks if the character is a digit
          {
            float_number = true; //returns true if yes
          }
          else if(i==0 && filename.charAt(0)=='.') //finds if there is a decimal point at the beginning of the numbers
          {
            float_number = true; //returns true if yes
            dotCount++;
          }
           else if(i==0 && (filename.charAt(0)=='+' || filename.charAt(0)=='-')) //neglects signs
          {
            float_number = true; //returns true if there is a sign
          }
          else if(filename.charAt(i)=='.') //finds if there is a decimal point
          {
            dotCount++; //reads the amount of decimals
            if(dotCount>1) //if decimal is more than 1
              return false; //return false
            else
            {
            float_number = true; //returns true if not
            }
          }
          else //if no condition is met
          {
            return false; //returns false
          }
          i++; //i increments
          }
          
          return float_number; //returns what float_number is, true or false
        }//end method 3
        
       public static void check(String input){ //method to check input
        if(isWord(input)) //is isWord matches input value
         wordCount++; //word count increments
        else if(isInteger(input)) //if not
         integerCount++; //integer increments
        else if(isFloat(input)) //if not
         floatCount++; //floating point numbers increments
        else //if no condition is met
         System.out.println(input+" is an invalid input"); //the input is invalid
       }
} //End class 