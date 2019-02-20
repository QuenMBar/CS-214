/* YearCodes.java is a driver for function yearCode().
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: Feb 15, 2019
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
    * yearCode() converts an academic year into its integer code.
    *
    * Receive: year, a string.
    * PRE: year is one of {freshman, sophomore, junior, or senior}.
    * Return: the integer code corresponding to year.
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
