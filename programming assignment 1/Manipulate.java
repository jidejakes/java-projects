/* Olujide Jacobs
 * CS 110
 * Programming Assignment
 * Manipulate.java
 * program #3
 * 9/24/2012
 */

import java.util.Scanner; //import scanner

public class Manipulate{ //declare class and main
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in); //create new scanner

//start program and declare variables and data types
    String enter;
    String para;
    String para1;
    String para2;
    int first; //first is an int because we are getting the indexOf the value
    String final_word;
    String color;
    String food;
    String animal;
    String fri_rel;
    
//promt the user to enter sentence
    System.out.println("Please enter at least one thing you love and also one thing you hate, your sentence must contain either *love* and *hate*: ");
    enter = in.nextLine();
    if (!enter.contains("love") && !enter.contains("hate")){ //if statement here helps user to know he/she has typed in the wrong sentence
      System.out.println("Your sentence has to contain either *love* or *hate*");
    }
    else{
      System.out.println("Your original sentence is: " + enter);
      //create a program to swap the word "love" and "hate"
      para = enter.replace("love","some"); 
      para1 = para.replace("hate","love");
      para2 = para1.replace("some","hate"); //format the sentence and paraphrase to replace the words "love" and "hate"
      System.out.println("Your paraphrased sentence is: " + para2);
      first = enter.indexOf(" "); //indexOf " " used here to swap where the first word ends to the end of the sentence
      final_word = para2.substring(first) + " " + para2.substring(0,first); //format the final sentence
      System.out.println("Your final sentence is: " + final_word);
      
      ////////////////////////////////
      //////////////////////////////////////////////
      ////////////PART 2///////////////////////
      ///////////////////////
      ///////////////////////////
      
//prompt user to enter favorite color, food, animal and first name of friend or relative
      System.out.println("Please enter your favorite color: ");
      color = in.next();
      System.out.println("Please enter your favorite food: ");
      food = in.next();
      System.out.println("Please enter your favorite animal: ");
      animal = in.next();
      System.out.println("Please enter the frist name of a friend or relative: ");
      fri_rel = in.next();
      System.out.println("I had a dream that" + " " + fri_rel + " " + "ate a" + " " + color + " " + animal + " " + "and said it tasted like" + " " + food + "!!!");
            
      return;
    }
}
  } //closes all programs and also the "if" and "else" statements

///////////////////////////////////////////////////////////END/////////////////////////////////////////////////////////