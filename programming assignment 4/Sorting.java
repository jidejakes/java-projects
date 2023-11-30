/* Matt Williamson
 * CS 110 Lab 9
 * Sections 2-4
 * Week of 11/5/12 to 11/9/12
 * Sorting.java
 */

/* This program reads a text file and stores all the words into an array of strings.  We then use 
 * three sorting algorithms (Bubble Sort, Selection Sort, and Insertion Sort) to sort the array 
 * based on the length of each word.
 */

import java.util.Scanner;
import java.io.*;

public class Sorting{
    public static void main(String[] args){
    
        /* Declare Variables */
        Scanner consolein = new Scanner(System.in);        //consolein is the Scanner for console input
        File infile = null;                                //infile is the File object
        Scanner in = null;                                 //in is the Scanner for file input
        String fileName = "";                              //fileName is the name of the file read
        boolean goodName = false;                          //goodName lets us know if the file name 
                                                           //entered by the user is valid
        String[] wordArray = new String[1000];             //wordArray is the array containing each word
                                                           //read from the file
        int arraySize = 0;                                 //arraySize is the number of words in the 
                                                           //file/array
        
        /* Repeat the try-catch block until the user has entered a valid file name. */
        while (!goodName){
            try{
                /* Ask the user to enter the name of the file to be read. */
                System.out.print("Please enter the name of the file: ");
                fileName = consolein.next();
                
                /* Create the File and Scanner objects */
                infile = new File(fileName);
                in = new Scanner(infile);
                
                /* If we get to this point, then we know the file name entered is valid. */
                goodName = true;
                
            }//end try
            catch(FileNotFoundException e){
                /* This part of the code happens if the file name entered is not valid. */
                System.out.println("The file name entered is not valid.");
            }//end catch
        }//end while
        
        /* Read each word in the file and store it in the array */
        while (in.hasNext()){
            /* If the number of words in the text file exceeds the size of the array, we have 
             * to stop reading words.  We can continue sorting though.
             */
            if (arraySize >= wordArray.length){
                System.out.println("The number of words has exceeded the length of the array.");
                break;
            }//end if
            wordArray[arraySize] = in.next();
            arraySize++;
        }//end while
        
        /* Print Original Array */
        printArray(wordArray, arraySize);
              
        /* Call sorting methods */
        bubbleSort(wordArray, arraySize);
        printArray(wordArray, arraySize);
        selectSort(wordArray, arraySize);
        printArray(wordArray, arraySize);
        insertionSort(wordArray, arraySize);        
        printArray(wordArray, arraySize);
        
        
    }//end main
    
    /* This method sorts the array using the bubble sort algorithm.
     * @param array String array containing the words in the text file
     * @param n     The size of the array
     */
    public static void bubbleSort(String[] array, int n){
        
        /* Declare Variables */
        String[] sortedArray = new String[n];  //sortedArray = array, this because we 
                                               //want to sort array three times without 
                                               //changing array
        String tempWord;                       //tempWord is a word in the array stored 
                                               //in a temporary variable
        boolean sorted = false;                //sorted lets us know when the array is sorted
        
        sortedArray = array.clone();
        
        /* Repeat until the array is fully sorted */
        while(!sorted){
          /* First assume the array is sorted. */
          sorted = true;
          
          /* Use a for loop to read each element, except for the last one. */
          for (int i=0; i<n-1; i++){
            /* If the length of the current word is greater than the length of the word in the 
             * next array element, then we need to swap these words.
             */
            if (sortedArray[i].compareToIgnoreCase(sortedArray[i+1]) > 0){
           
              /* Swap the words */
              tempWord = sortedArray[i];
              sortedArray[i] = sortedArray[i+1];
              sortedArray[i+1] = tempWord;
              
              /* Set sorted to false since the array isn't sorted. */
              sorted = false;
            }//end if
          }//end for
        }//end while
        
        /* Print Sorted Array */
        printArray(sortedArray, n);
        
    }//end bubbleSort
    
    /* This method sorts the array using the selection sort algorithm.
     * @param array String array containing the words in the text file
     * @param n     The size of the array
     */
    public static void selectSort(String[] array, int n){
        
        /* Declare Variables */
        String[] sortedArray = new String[n];  //sortedArray = array, this because we 
                                               //want to sort array three times without 
                                               //changing array
        String minWord;                        //minWord is the word the current smallest length
        int minIndex;                          //minIndex is the array index of the word with 
                                               //the current smallest length
        sortedArray = array.clone();
        
        /* Use a for loop to go through each element in the array */
        for (int i=0; i<n-1; i++){
            /* We initialize the current word with the smallest length as the word in 
             * position i.
             */
            minIndex = i;
            minWord = sortedArray[i];
            
            /* Read the remaining elements in the array to find the word with the correct current 
             * minimum length.
             */
            for (int j=i+1; j<n; j++){
              /* If the current word we're reading has a smaller length than the current minimum word, 
               * then we need to change the minimum word.
               */
              if (sortedArray[j].compareToIgnoreCase(minWord) < 0){
                minWord = sortedArray[j];
                minIndex = j;
              }//end if
            }//end for
            
            /* Swap the word in the current position with the word with the current smallest length. */
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = minWord;
        }//end for
        
        /* Print Sorted Array */
         printArray(sortedArray, n);
        
    }//end selectSort
    
    /* This method sorts the array using the insertion sort algorithm.
     * @param array String array containing the words in the text file
     * @param n     The size of the array
     */
    public static void insertionSort(String[] array, int n){
        
        /* Declare Variables */
        String[] sortedArray = new String[n];  //sortedArray = array, this because we 
                                               //want to sort array three times without 
                                               //changing array
        String tempWord;                       //tempWord is a temporary variable storing a word in the
                                               //array
        int tempIndex;                         //tempIndex is the position in the array with the 
                                               //temporary word
        sortedArray = array.clone();
        
        /* Use a for loop to read each element in the array. */
        for (int i=1; i<n; i++){
            /* Let the word at position i be the initial temporary word. */
            tempIndex = i;
            tempWord = sortedArray[tempIndex];
            
            /* Start at the position at i and go backwards in the array until the word is in the 
             * correct spot.
             */
            while (tempIndex > 0 && sortedArray[tempIndex-1].compareToIgnoreCase(tempWord) > 0){
                /* Move the word at index tempIndex-1 over one spot. */
                sortedArray[tempIndex] = sortedArray[tempIndex-1];
                tempIndex--;
            }//end while
            
            /* Once we find the correct spot, put tempWord in that spot. */
            sortedArray[tempIndex] = tempWord;
        }//end for
        
        /* Print Sorted Array */
        printArray(sortedArray, n);
        
    }//end insertionSort
    
    /* This method prints all elements in an array.
     * @param array String array containing the words in the text file
     * @param n     The size of the array
     */
    public static void printArray(String[] array, int n){
        
        /* Print Sorted Array */
        for (int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }//end for
        System.out.println();
        System.out.println();
    }
  
}//end class