/* Olujide Jacobs
 * Programming Assignment 5
 * CS 110
 * 12/5/2012
 * Matrix.java
 */


/* this class is responsible for throwing the matrix dont match errorr */
public class MatrixDontMatchException extends Exception {
  public MatrixDontMatchException(String s) {
   super(s);
  }
 }