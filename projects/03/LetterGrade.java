/* LetterGrade.java is a driver for function letterGrade().
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed and Edited by by: Quentin Barnes
 * Date: Feb 23, 2019
 ****************************************************************/

import java.util.Scanner;

public class LetterGrade {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nEnter your grade average: "); // prompt

      int average = Integer.parseInt(keyboard.next());      // read year
      System.out.println(letterGrade(average)); // display its code
   }

   /***************************************************************
    * letterGrade() converts a grade average to its coresponding letter grade
    *
    * Receive: average, an int
    * PRE: average is <= 100 and >= 0
    * Return: A letter grade A, B, C, D, or F
    */

    public static char letterGrade(int average){
      switch (average / 10)
      {
         case 10: case 9:
            return 'A';
         case 8:
            return 'B';
         case 7:
            return 'C';
         case 6:
            return 'D';
         default:
            return 'F';
      }
   }

}
