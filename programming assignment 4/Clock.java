/* Olujide Jacobs
 * CS 110 Lab 10
 * Section 4
 * 11/22/2012
 * Clock.java
 */

/* this program simulates a clock by keeping track of the hour minute and second */
public class Clock {
  
    /* this method sets the time to 12:00:00 AM */
  
  public static String clock(){ //method clock
    
    Scanner in = new Scanner(System.in); //new scanner
    
    String initial = "12:00:00 AM"; //initialize time to 12:00 Am
    
    return initial; //return initial
    
  } //close method
  
  /* this method prints the time in correct time format */
  
  public static void printClock(){ //method print clock
    
    String initial = Integer.toString(int initial); //converts to string
  } //close method
  
  /* this method sets the hour by asking the user for the hour */
  
  public static void setHour(){ //method setHour
    
    System.out.println("Please enter the hour."); //asks user for the hour
    int hour = in.nextInt(); //read it in
    
    if(hour < 1 || hour > 12){ //validation that hour is accurate
    System.out.println("Enter valid hour from 1 to 12"); //error message
    }
    else{
      System.out.println("Enter the time of the day AM or PM"); //asks user for time of the day
      String day = in.next(); //read it in
      
      if(!day.equals("AM") || !day.equals("PM")){ //validation statement that use enters the right time of day
        System.out.println("Enter valid time of day"); //error message
      }
      else{ 
        System.out.print();
      }
    }
    return day; //return day
  } //close method
  
  /* this method sets the minute by asking the user for the minute */
  
  public static void setMinute(){ //method setMinute
    
    System.out.println("Please enter the minute."); //asks user for minute
    int minute = in.nextInt(); //read it in
    
    if(minute < 0 || minute > 59){ //validation that minute doesn't exceed 59 and not less than 0
      System.out.println("Please enter valid minute from 0 to 59"); //error message
    }
    else{
      System.out.println();
    }
   return minute; //return minute
  } //close method
  
  /* this method sets the second by asking the user for the second */
  
  public static void setSecond(){ //method setSecond
    
    System.out.println("Please enter the second."); //asks user for second
    int second = in.nextInt(); //read it in
    
    if(second < 0 || second > 59){ //validation that minute doesn't exceed 59 and not less than 0
      System.out.println("Please enter valid second from 0 to 59"); //error message
    }
    else{
      System.out.println();
    }
   return second; //return second
  } //close method
  
  /* this method increments the hour */
  
  public static void incrementHour(){ //method incrementHour
    for(int i=0; i<=hour; i++){ //hour increment
      if(i==hour){
        hour++;
      }
        if(hour>12){ //increases hour by 1
          hour = 1;
        hour++;
        }
    }
    return hour; //return hour
  } //close method
  
  /* this method increments the minute */
  
  public static void incrementMinute(){ //method incrementMinute
    for (int i=0; i<=minute; i++){ //for loop to increment minute 
      if(i==minute){
        minute++;
      }
        if(minute>59){
          minute = 0;
        minute++;
        }
     }
     return minute; //return minute
   }

  /* this method increments the second */
  
public static void incrementSecond(){ //method incrementSecond
    for (int i=0; i<=second; i++){ // second increment
      if(i==second){
        second++; //increment second
      }
        if(second>59){
          second = 0;
        second++;
        }
     }
     return second; //return second
   }

/* this method resets the clock back to the initial time 12:00:00 AM */

public static void resetClock(){ //method resetClock
  reset = initial; //set reset to initial
  
  return reset; //return reset
} //end method
} //end class