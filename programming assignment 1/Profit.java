/* Olujide Jacobs
 * CS 110
 * Programming Assignment
 * Profit.java
 * program #2
 * 9/24/2012
 */

import java.util.Scanner; //import scanner

public class Profit{ //declare class and main
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in); //create new scanner

//start program and declare variables
    double cake_mon;
    double cake_tue;
    double cake_wed;
    double cake_thur;
    double cake_fri;
    double cake_sat;
    double cake_sun;
    double cake_sold_week;
    double cake_cost;
    double cake_price;
    double cake_num_produced; 
    double cake_cost_week; 
    double cake_earning_week; 
    double total_profit; //all variables are stored as a double
    
// prompt user to input values
    System.out.println("Please enter the number of cupcakes baked on Monday: ");
    cake_mon = in.nextDouble();
    if (cake_mon<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
    System.out.println("Please enter the number of cupcakes baked on Tuesday: ");
    cake_tue = in.nextDouble();
    if (cake_tue<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
    System.out.println("Please enter the number of cupcakes baked on Wednesday: ");
    cake_wed = in.nextDouble();
    if (cake_wed<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
    System.out.println("Please enter the number of cupcakes baked on Thursday: ");
    cake_thur = in.nextDouble();
    if (cake_thur<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
    System.out.println("Please enter the number of cupcakes baked on Friday: ");
    cake_fri = in.nextDouble();
    if (cake_fri<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
    System.out.println("Please enter the number of cupcakes baked on Saturday: ");
    cake_sat = in.nextDouble();
    if (cake_sat<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
    System.out.println("Please enter the number of cupcakes baked on Sunday: ");
    cake_sun = in.nextDouble();
    if (cake_sun<0){
      System.out.println("It's not possible to produce a negative number of cupcakes");
    }
    else{
      cake_num_produced = (cake_mon+cake_tue+cake_wed+cake_thur+cake_fri+cake_sat+cake_sun); //i put this calculation here because i need to use the variable soon and compare with number of cakes sold in the if statement
    System.out.println("Please enter the number of cupcakes sold at the end of the week: ");
    cake_sold_week = in.nextDouble();
    if (cake_sold_week<0 || cake_sold_week>cake_num_produced){
      System.out.println("It's not possible to sell a negative number of cupcakes and it's not possible to sell more than you produced so check what you typed in for any error.");
    }
    else{
    System.out.println("Please enter the cost of production for each cupcake: ");
    cake_cost = in.nextDouble();
    if (cake_cost<0){
      System.out.println("It's not possible for the cost of production to be a negative amount.");
    }
    else{
    System.out.println("Please enter the price each cupcake was sold: ");
    cake_price = in.nextDouble();
    if (cake_price<0){
      System.out.println("It's not possible for the selling amount to be a negative amount.");
    }
    else{ //if statements were used in all cases so user does not input just any value that's not reasonable and can realize where mistakes were made

//start calculations
    cake_cost_week = (cake_cost*cake_num_produced);
    cake_earning_week = (cake_sold_week*cake_price);
    total_profit = (cake_earning_week-cake_cost_week);
    if (total_profit<0){
      System.out.println("The total number of cupcakes produced this week is" + " " + cake_num_produced + " " + "and the number of cupcakes sold this week is" + " " + cake_sold_week);
      System.out.println("The production cost for the week is" + " " + cake_cost_week + " " + "dollar(s)");
      System.out.println("The gross earning for the week is" + " " + cake_earning_week + " " + "dollar(s)");
      System.out.println("The total profit is" + " " + total_profit + " " + " " + "dollar(s)" + "," + " " + "which is a loss."); //outputs a loss if profit is less than zero
    }
    else{
    
//print out values
    System.out.println("The total number of cupcakes produced this week is" + " " + cake_num_produced + " " + "and the number of cupcakes sold this week is" + " " + cake_sold_week); //prints out number of cupcake produced and sold at the end of the week
    System.out.println("The production cost for the week is" + " " + cake_cost_week + " " + "dollar(s)"); //print our cost of production for the week
    System.out.println("The gross earning for the week is" + " " + cake_earning_week + " " + "dollar(s)"); //print out week's earning
    System.out.println("The total profit is" + " " + total_profit + " " + "dollar(s)"); //print out total profit
    }
    
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
    }
  }
} //closes all "if" and "else" statements and also the whole program
 
////////////////////////////////////////////////////////END////////////////////////////////////////////////////////////