/* Split.java is a class and program that splits a string
 * into two substrings.
 * 
 * Begun by: Serita Nelesen
 * Completed by: Quentin Barnes on March 2, 2019
 ***************************************************************/

import java.util.Scanner;

// java class Split
public class Split
{
  // main program
  public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      // prompt for the string
      System.out.println("\nTo split a string, enter the string: ");
      String theString = keyboard.next();
      
      // prompt for splitting position
      System.out.println("\nEnter the split position: ");
      int position = keyboard.nextInt();

      //Create list, compute results and print
      String [] resultList = new String[2];
      splitter(theString, position, resultList);
      System.out.println("\nThe first part is " + resultList[0] + "\n and the second part is " + resultList[1]);
      
    }
  
  /* splitter() splits a string according to the position specified
   * Receive: 	theString - the string to be split
   * 		        pos - the position at which to split
   *            resList - an array of strings in which to place results
   *****************************************************/
  public static void splitter(double a, double b, double c, double[] results){
    if (a != 0) {
      double arg = pow(b, 2.0) - 4 * a * c;
      if (arg >= 0) {
         root1 = (-b + sqrt(arg))/(2*a);
         root2 = (-b - sqrt(arg))/(2*a);
         return true;
      } else {
         cerr << "\n*** quadraticRoots(): b^2 - 4ac is negative!" << endl;
         root1 = root2 = 0.0;
         return false;
      }
   } else {
      cerr << "\n*** QuadraticRoots(): a is zero!" << endl;
      root1 = root2 = 0.0;
      return false;
   }
  } 


}
