/* Olujide Jacobs
 * CS 110
 * Programming Assignment
 * Grade.java
 * program #1
 * 9/24/2012
 */

import java.util.Scanner; //import scanner

public class Grade{ //declare class and main
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in); //create new scanner

//start program and declare variables
    String first;
    String last; //names have to be stored as a string because they are not integers
    Double exam1;
    Double exam2;
    Double exam3;
    Double hw1;
    Double hw2;
    Double hw3;
    Double final_grade;
    Double lab_avg;
    Double hw_avg;
    Double semester; //all variables are stored as a double
    
// prompt user to input values    
    System.out.print("Please enter your first name: ");
    first = in.next();
    System.out.print("Please enter your last name: ");
    last = in.next();
    System.out.print("Please enter your first exam score out of 100: ");
    exam1 = in.nextDouble();
    if (exam1>100){
      System.out.println("Your grade can't exceed 100 since it's out of 100.");
    }
    else{       
    System.out.print("Please enter your second exam score out of 100: ");
    exam2 = in.nextDouble();
    if (exam2>100){
      System.out.println("Your grade can't exceed 100 since it's out of 100.");
    }
    else{
    System.out.print("Please enter your third exam score out of 100: ");
    exam3 = in.nextDouble();
    if (exam3>100){
      System.out.println("Your grade can't exceed 100 since it's out of 100.");
    }
    else{
    System.out.print("Please enter your first homework score out of 20: ");
    hw1 = in.nextDouble();
    if (hw1>20){
      System.out.println("Your grade can't exceed 20 since it's out of 20.");
    }
    else{
    System.out.print("Please enter your second homework score out of 20: ");
    hw2 = in.nextDouble();
    if (hw2>20){
      System.out.println("Your grade can't exceed 20 since it's out of 20.");
    }
    else{
    System.out.print("Please enter your third homework score out of 20: ");
    hw3 = in.nextDouble();
    if (hw3>20){
      System.out.println("Your grade can't exceed 20 since it's out of 20.");
    }
    else{
    System.out.print("Please enter your final exam score out of 100: ");
    final_grade = in.nextDouble();
    if (final_grade>100){
      System.out.println("Your grade can't exceed 100 since it's out of 100.");
    }
    else{
    System.out.print("Please enter your lab average out of 100: ");
    lab_avg = in.nextDouble();
    if (lab_avg>100){
      System.out.println("Your grade can't exceed 100 since it's out of 100.");
    }
    else{ //if statements were used in all cases so user does not input just any value that's not reasonable and can realize where mistakes were made
    
    //start calculations
    hw_avg = (hw1+hw2+hw3)/3; //average of three homeworks
    exam1 = exam1/100*15;
    exam2 = exam2/100*15;
    exam3 = exam3/100*15; //each exam grade worths 15% of semester grade
    lab_avg = lab_avg/100*25; //lab average is worth 25% of semester grade
    final_grade = final_grade/100*20; //final grade is worth 20% of semester grade
    hw_avg = hw_avg/20*10; //homework average worths 10% of semester grade
    semester = (exam1+exam2+exam3+lab_avg+final_grade+hw_avg); //add up all grades to get semester grade
    
    System.out.println("Full name: " + first + " " + last); //prints first and last name
    System.out.println("First, second and third exam grades: " + (exam1/15*100) + "," + " " + (exam2/15*100) + "," + " " + (exam3/15*100)); //prints three exam grades, divided by 15 and multiplied by 100 so the program can print exact exam grade in each case
    System.out.println("Final exam grade: " + (final_grade/20*100)); //prints final exam grade, divides by 20 and multiplies by 100 so exact grade can be printed
    System.out.println("Homework average: " + (hw_avg/10*20)); //prints average of three homeworks, divides by 10 and multiplies by 20 so actual grade can be printed
    System.out.println("Your semester average is: " + semester); //prints semester average
      
    return;
  }
}
}
}
}
}
}
}
}
} //closes all "if" and "else" statements and also the whole program

/////////////////////////////////////////////////////////END///////////////////////////////////////////////////////////