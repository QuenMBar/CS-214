Script started on Sat 16 Feb 2019 05:17:00 PM EST
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ cat YearCodes.java
/* YearCodes.java is a driver for function yearCode().
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: Feb 15, 2019
 ****************************************************************/

import java.util.Scanner;

public class YearCodes {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nEnter your academic year: "); // prompt

      String year = keyboard.next();      // read year
      System.out.println(yearCode(year)); // display its code
   }

   /***************************************************************
    * yearCode() converts an academic year into its integer code.
    *
    * Receive: year, a string.
    * PRE: year is one of {freshman, sophomore, junior, or senior}.
    * Return: the integer code corresponding to year.
    */

    public static int yearCode(String year){
      if (year.equals("freshman"))
         return 1;
      else if (year.equals("sophomore"))
         return 2;
      else if (year.equals("junior"))
         return 3;
      else if (year.equals("senior"))
         return 4;
      else
         return 0;
   }

}
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ javac -deprecation YearCodes.java
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
freshman
1
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
sophomore
2
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
junior
3
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
senior
4
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
Senior
0
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
sen
0
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ java YearCodes

Enter your academic year: 
1
0
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ exit

Script done on Sat 16 Feb 2019 05:18:56 PM EST
