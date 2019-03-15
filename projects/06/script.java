Script started on Thu 14 Mar 2019 08:17:04 PM EDT
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ cat array     Array_Processing.java 

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
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ javac -deprecation Array_Processing.java 
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ java Array_Processing. 
Enter the size of the array: 6
Enter value 1: 3.52
Enter value 2: 4.6
Enter value 3: 7
Enter value 4: 0.1
Enter value 5: 4.1
Enter value 6: 2
Enter the array entered is: 
3.52
4.6
7.0
0.1
4.1
2.0
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ exit

Script done on Thu 14 Mar 2019 08:18:32 PM EDT
