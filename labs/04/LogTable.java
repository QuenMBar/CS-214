/* LogTable.java displays a table of logarithms.
 *
 * Input: start, stop and increment, three doubles.
 * PRE: start < stop && increment > 0.
 * Output: A table of logarithms from start to stop,
 *         with increment as the step value.
 * Begun by: Nelesen, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes on Feb 23, 2019
 ********************************************************/
import java.util.Scanner; 		// Get input
import java.lang.Math;

class LogTable{

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("To display a table of logarithms,");
    System.out.println("enter the start, stop and increment values: ");
    double start, stop, increment;
    start = keyboard.nextDouble();
    stop = keyboard.nextDouble();
    increment = keyboard.nextDouble();

    while (start <= stop) {
      System.out.println("The logarithm of " + start + " is " + Math.log10(start));
      start += increment;
    }

  }
}

