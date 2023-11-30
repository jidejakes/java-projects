/* Olujide Jacobs
 * Programming Assignment 5
 * CS 110
 * 12/5/2012
 * Matrix.java
 */

public class Matrix { //class matrix
 private static int theMatrix[][];
 private static int N; //matrix N
 private static int M; //matrix M

 public Matrix() {
  theMatrix = new int[3][3]; //new 3X3 matrix
  N = 3; //N set to 3 dimension
  M = 3; //M set to 3 dimension
 }

 public Matrix(int rows, int cols) {
  theMatrix = new int[rows][cols]; //rows and columns set
  N = rows; //N set to rows
  M = cols; //M set to columns
 }

 public void clear() { //method clear
  for (int i = 0; i < N; i++) {
   for (int j = 0; j < M; j++) {
    theMatrix[i][j] = 0; //set to zero
   }
  }
 }

 /* this method is responsible for the switching of two matrices */
 public static void swap(Matrix A, Matrix B) throws InequalityException {
  if (!((A.N == B.N) && (A.M == B.M)))
   throw new InequalityException("The Matrices have unequal sizes"); //error message
  else {
   Matrix C = B; //swap procedure
   B = A;
   A = C;
  }
 }

 /* this method is responsible for filling the matrix with random numbers */
 public void fill() {
  for (int i = 0; i < N; i++) {
   for (int j = 0; j < M; j++) {
    theMatrix[i][j] = (int) (Math.random() * 10); //fills matrix randomly
   }
  }
 }

 public void print() { //this method prints out the contents of a matrix
  for (int i = 0; i < N; i++) {
   for (int j = 0; j < M; j++) {
    System.out.print(theMatrix[i][j] + " "); //prints out the matrix
   }
   System.out.println(); //space
  }
 }

 @SuppressWarnings("static-access")
public static Matrix add(Matrix A, Matrix B) throws InequalityException { //this method adds two matrices
  Matrix C;
  if (!((A.N == B.N) && (A.M == B.M)))
   throw new InequalityException("The Matrices have unequal sizes");
  else {
   C = new Matrix(A.N, A.M);
   for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
     (C.theMatrix)[i][j] = (A.theMatrix)[i][j]
       + (B.theMatrix)[i][j]; //adds the matrices
    }
   }
  }
  return C;

 }

 @SuppressWarnings("static-access")
public static Matrix subtract(Matrix A, Matrix B) throws InequalityException { //this method subtracts two matrices
  Matrix C;
  if (!((A.N == B.N) && (A.M == B.M)))
   throw new InequalityException("The Matrices have unequal sizes"); //error message
  else {
   C = new Matrix(A.N, A.M);
   for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
     (C.theMatrix)[i][j] = (A.theMatrix)[i][j]
       - (B.theMatrix)[i][j]; //subtracts the matrices
    }
   }
  }
  return C;

 }

 @SuppressWarnings("static-access")
public static Matrix multiply(Matrix A, Matrix B) throws MatrixDontMatchException { //this method multiplies tow matrices
  int Arows = A.N;
  int Acols = A.M;
  int Brows = B.N;
  int Bcols = B.M;
  int result[][];
  Matrix C;
  if (Acols != Brows)
   throw new MatrixDontMatchException("matrices don't match: " + Acols
     + " != " + Brows);
  else {
   result = new int[Arows][Bcols];
   for (int i = 0; i < Arows; i++)
    for (int j = 0; j < Bcols; j++)
     for (int k = 0; k < Acols; k++)
      result[i][j] += (A.theMatrix)[i][k]
        * (B.theMatrix)[k][j]; //multiply the matrices
   C = new Matrix(Arows, Bcols);
   C.theMatrix = result;
  }
  return C;
 }

 @SuppressWarnings("static-access")
public Matrix transposeMatrix() { //this method finds the transpose of a matrice
  int r = N;
  int c = M;
  int[][] t = new int[c][r];
  for (int i = 0; i < r; ++i) {
   for (int j = 0; j < c; ++j) {
    t[j][i] = theMatrix[i][j];
   }
  }
  Matrix C = new Matrix(M, N);
  C.theMatrix = t; //C matrix set to t
  return C; //returns C
 }

} //end program