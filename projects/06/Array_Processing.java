
/* Array_Processing.java allows the user to enter an array and print the entered array
 *
 * Student Name: Quentin Barnes
 * Date: 3/14/19
 *
 * Recive: the values of an array
 * Output: the entered array
 ***************************************************************/

import java.util.Scanner;

public class Array_Processing {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int theSize = keyboard.nextInt();

    double theArray[] = new double[theSize];

    readArray(theArray, theSize);

    System.out.println("Enter the array entered is: ");
    printArray(theArray, theSize);
  }

  /*
   * printArray() is a function that prints an array that it is given based on the
   * size it is given Recives: An array and its size
   ************************************************************/

  public static void printArray(double theArray[], int theSize) {
    for (int i = 0; i < theSize; i++) {
      System.out.println(theArray[i]);
    }
  }

  /*
   * readArray() is a function that lets the user enter values into an array
   * Recives: An array and its size
   **************************************************************/

  public static void readArray(double anArray[], int itsSize) {
    Scanner keyboard = new Scanner(System.in);
    for (int i = 0; i < itsSize; i++) {
      System.out.print("Enter value " + (i + 1) + ": ");
      anArray[i] = keyboard.nextDouble();
    }
  }

}
