/* Olujide Jacobs
 * Cs 110
 * Programming assignment #2
 * 10/9/2012
 */

//import scanner//
import java.util.Scanner;
import java.util.regex.Pattern;

//begin class//
public class Binary{
  public static void main(String[] args){
    
    //create new scanner//
    Scanner in = new Scanner(System.in);
    
    
//declare variables//
    String binary;
//prompt user to enter binary numbers//
    System.out.println("Please enter a binary number as a sequence of 1's and 0's or enter *quit* to end program. e.g 1001: ");
    binary = in.next();
    
//if statement to make sure user inputs binary containing 1's and 0's//
    while(!binary.equals("quit")){
      int evaluation=0;
      //declare variable degree//
    int degree;
    if (!Pattern.matches("[0-1]+",binary)){
      System.out.println("ERROR: You didn't enter a number containing 1 and 0");
      System.out.println("Please enter a binary number as a sequence of 1's and 0's or enter *quit* to end program. e.g 1001: ");
      binary = in.next();
    }
    else{
      //counter to find out the length and count it//
      int counter=0;
      degree=binary.length()-1;
     while(counter<binary.length())
     {
       //evaluation adds all the power(pow) of each number multiplied by 2//
       evaluation+=Character.digit(binary.charAt(counter),10)*Math.pow(2,degree);
       //degree decrements to reduce the power of the number multiplied by 2 and counter increments//
       counter++;
       degree--;
     }
      
      //output of the evaluation and prompts the user to enter another binary or quit//
      System.out.println("The decimal value of" + " " + binary + " " + "is" + " " + evaluation + ".");
      System.out.println("Do you want to enter another binary? If not, enter *quit* to end program. e.g 1001: ");
      binary = in.next();
      //this asks the user to input a value again if the input is wrong by going back to the start of the loop//
      continue;
    }
    }
      System.out.println("Thank You, have a good day!");  
    }
} //END//