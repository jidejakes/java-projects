/* Olujide Jacobs
 * CS 110
 * Programming assignment 4
 * 11/20/12
 * Sort.java
 */

/* this program searches and sorts different data in a file and it lets the user realize the most effective sorting 
 * method */

import java.util.Scanner; //import new scanner
import java.io.*; //import java io

public class Sort{ //define class
  
  Timers t = new Timers(); //declare new timer
  
  public void main(String[] args){ //start main
    
    Scanner in = new Scanner(System.in); //new scanner
    
    boolean readfile= false; //readfile is set to false to validate the file location
    
    while (!readfile){ //while loop used to set the condition as is executes the program
      
    System.out.println("Please enter file name."); //prompt user to enter file name
    String array = in.next(); //read it in

    try //try-catch block used to throw the error type when file can't be found
    {
      Scanner inFile = new Scanner(new File(array)); //file is read into the java program from the destination
      readfile=true;
    }
    catch(FileNotFoundException e) //file not found error
    {
      
      System.out.println("Cannot find file."); //throws this error
      readfile=false;
    }
    }
    
    int[] integerArray = new int[20000];
    int arraySize = 0;
    int[] bubbleSortCopy;
    
    while (in.hasNext()){ //if the number values in the data file exceeds the size of the array, it stops 
    
      if (arraySize >= integerArray.length){
                System.out.println("The number of Numbers has exceeded the length of the array.");
                break;
            }//end if
            integerArray[arraySize] = in.nextInt();
            arraySize++;
        }//end while'
    
    System.out.println("Do you want to search or exit the program? Y for yes and N for no."); //prompt user    
    String search = in.next(); //read it in
    char exit = 'N'; //the exit variable
    
    while (exit !='Y' &&  exit != 'y') {
    
    t.start(); //start timer
    searchLinear(integerArray,arraySize); //call method
    t.stop(); //stop timer
    t.duration(); //check duration of timer
    t.reset(); //reset timer
    
    t.start(); //start timer
    searchBinary(integerArray,arraySize); //call method
    t.stop(); //stop timer
    t.duration(); //check duration of timer
    t.reset(); //reset timer
    
    t.start(); //start timer
    bubbleSort(integerArray,arraySize); //call method
    t.stop(); //stop timer
    t.duration(); //check duration of timer
    t.reset(); //reset timer
    
    t.start(); //start timer
    selectionSort(integerArray,arraySize); //call method
    t.stop(); //stop timer
    t.duration(); //check duration of timer
    t.reset(); //reset timer
    
    t.start(); //start timer 
    insertionSort(integerArray,arraySize); //call method
    t.stop(); //stop timer
    t.duration(); //check duration of timer
    t.reset(); //reset timer
       
  }
  
    exit = (in.next().charAt(0));
  }
    
  /* this method returns the integer number representing the index 
   * number of the element containing the search value */
    public static int searchLinear(int[] array, int value){ //linear search method
      
      int point = 0; //location of search initialized to zero
      boolean find = false; //find indicates when the value is found
      int result = -1; //if the search value is not found
      
      while(!find && point < array.length){ //while the location and result is less than the array length
        if(array[point] == value){ //if the array at the location is the value
          find = true; //new find result is true
        }
        else{
          point++; //else, point increments
        }
      }
        if(find)result = point; //if the result matches search value
        
        return result; //new value is returned
      } //end linear search method
    
    /* this method implements the binary search algorithm using iteration.  
     * It returns the index number of the element containing the search value */
    public static int searchBinary(int[] array, int value){ //binary search method
      
      int result = -1; //if the search value is not found
      int middle; //middle of the array
      boolean find = false; //find indicates when the value is found
      int down = 0; //first value of the array set to zero
      int high = array.length-1; //last value of the array
      
      while(!find && down <= high){ //while the location and first value is less than or equal the array length
        middle = (down + high) / 2; //middle is first plus last value divided by two
        
        if(array[middle] == value){ //if middle array is the search value
          result = middle; //result becomes middle array which is the search value
          find = true;
        }
        else if(value < array[middle]){ //or else, if the search value is less than the middle value
          high = middle - 1; //the last value becomes middle value minus one
        }
        else{ //if non of these conditions are met
          down = middle + 1; //the first value becomes the middle value plus one
        }
      } //end while statement
      
      return result; //return result
    } //end binary search method
    
    /* this method implements the bubble sort algorithm using loops.  It receives an unsorted integer 
     * array as input, and reorders the elements of the array. */
    public static void bubbleSort(int[] array, int value){ //bubble sort method
      
        array = new int[value]; //new array
        int temp; //temporary variable to make swapping easy
        boolean result = false; //result set to false for validation
        
        while(!result){ //while result isn't obtained
          result = true;
          for (int i=0; i < value-1; i++){ //for every value of i till value minus one
            
            if (array[i] > array[i+1]){ //swapping array pre conditions
              temp = array[i];
              array[i] = array[i+1];
              array[i+1] = temp;
              
              try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //create a buffered reader that 
                                                                                //connects to the console, we use it 
                                                                                //so we can read lines

      String lineFromInput = in.readLine(); //read a line from the console

      PrintWriter out = new PrintWriter(new FileWriter("bubble.txt")); //create print writer for writing to a file

      out.println(lineFromInput); //output to the file a line

      out.close(); //close the file
   }
      catch(IOException e) {
        System.out.println("Error during reading/writing");
   }
              
              result = false; //result set to false
            }
          }
        }//end while
    }//end bubble sort method
    
    /* this method implements the selection sort algorithm using loops.  
     * It receives an unsorted integer array as input, and reorders the elements of the array */
    public static void selectionSort(int[] array, int value){ //selection sort method
      
      int min; //min value
      int temp; //temporary variable to make swapping easy
      value = array.length; //array length
      
      for (int i = 0; i < value-1; i++) { //for every value of i till it's less than value minus one
            min = i;
            for (int j = i+1; j < value; j++){ //for every value of j till it's less than value
              if (array[j] < array[min]){
                        min = j;
              }
            if (min != i) {
                  temp = array[i];
                  array[i] = array[min];
                  array[min] = temp;
            }
            }
            
            try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //create a buffered reader that 
                                                                                //connects to the console, we use it 
                                                                                //so we can read lines

      String lineFromInput = in.readLine(); //read a line from the console

      PrintWriter out = new PrintWriter(new FileWriter("selection.txt")); //create print writer for writing to a file

      out.println(lineFromInput); //output to the file a line

      out.close(); //close the file
   }
      catch(IOException e) {
        System.out.println("Error during reading/writing");
   }
            
      }
} //end selection sort method
    
    public static void insertionSort(int[] array, int value) { //insertion sort method
      
      for (int i = 1; i < array.length; i++){ //for each value of i till it's equal or greater than the array length
            value = array[i]; //value set to array at position i
            int j = i; //j becaomes i
            while (j > 0 && array[j-1] > value){ //while j is greater than value
                  array[j] = array[j-1]; //array at j becomes array at j-1
                  j--; //j decrements
            }
            array[j] = value; //array at j becomes value
      }
      
      try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //create a buffered reader that 
                                                                                //connects to the console, we use it 
                                                                                //so we can read lines

      String lineFromInput = in.readLine(); //read a line from the console

      PrintWriter out = new PrintWriter(new FileWriter("insertion.txt")); //create print writer for writing to a file

      out.println(lineFromInput); //output to the file a line

      out.close(); //close the file
   }
      catch(IOException e) {
        System.out.println("Error during reading/writing");
   }
      
    } //end method insertion method
} //end class