/* Matt Williamson
 * CS 110 Lab 10
 * Sections 2-4
 * Week of 11/12/12 to 11/16/12
 * Lab10.java
 */

import java.util.Scanner;

/* This program tests the Clock class.  We first construct an instance of the clock 
 * and then ask the user to enter the hour, minute, second, and whether the the time 
 * is AM or PM.  We then increment the second, minute, and hour by one.  This repeats 
 * until the user is done.
 */

public class Lab10 extends Clock{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);    //in is the console scanner
    char exit = 'N';                        //exit is used to determine when to quit
    
    /* Create Clock object */
    Clock c = new Clock();
    
    /* Print original clock */
    c.printClock();
    
    /* Keep running until the user says he/she is done. */
    while (exit != 'Y' && exit != 'y'){
      c.setHour();
      c.setMinute();
      c.setSecond();
      c.printClock();
      
      /* Increment hour, minute, and second by one. */
      c.incrementSecond();
      c.printClock();
      c.incrementMinute();
      c.printClock();
      c.incrementHour();
      c.printClock();
      
      /* Reset the clock */
      c.resetClock();
      
      /* Ask the user whether to quit or not. */
      System.out.print("Do you want to quit? Enter Y to quit, or N otherwise: ");
      exit = (in.next()).charAt(0);
    }
  }
  
}