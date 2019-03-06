
/* QuadraticRoots.java is a program for finding the roots of a quadratic 
 * function y = ax^2 + bx + c where a, b, c are given by the user.
 * 
 * Written by: Quentin Barnes on March 5, 2019
 ***************************************************************/

import java.util.Scanner;
import java.lang.Math;

// Main program that takes in a, b, c as doubles and then calls the quadraticRoots function and prints its result
public class QuadraticRoots {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    // prompt for doubles
    System.out.println(
        "\nTo compute the roots of a quadratic equation given\nan equasion of the form: y = ax^2 + bx + c \nEnter a: ");
    double aIn = keyboard.nextDouble();

    System.out.println("\nEnter b: ");
    double bIn = keyboard.nextDouble();

    System.out.println("\nEnter c: ");
    double cIn = keyboard.nextDouble();

    // Create list, compute results and print
    double[] resultList = new double[2];
    quadraticRoots(aIn, bIn, cIn, resultList);
    System.out.println("\nThe first root is: " + resultList[0] + "\n and the second root is: " + resultList[1]);

    keyboard.close();

  }

  /*
   * quadraticRoots() finds the roots of function y = ax^2 + bx + c: a, b, c:
   * Doubles provided by the user results: List of doubles to pass back the roots
   * to main
   *****************************************************/
  public static void quadraticRoots(double a, double b, double c, double[] results) {
    if (a != 0) {
      double arg = Math.pow(b, 2.0) - 4 * a * c;
      if (arg >= 0) {
        results[0] = (-b + Math.sqrt(arg)) / (2 * a);
        results[1] = (-b - Math.sqrt(arg)) / (2 * a);
      } else {
        System.out.println("\n*** quadraticRoots(): b^2 - 4ac is negative!");
        results[0] = results[1] = 0.0;
      }
    } else {
      System.out.println("\n*** QuadraticRoots(): a is zero!");
      results[0] = results[1] = 0.0;
    }
  }

}
