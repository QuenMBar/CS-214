Script started on Sat 02 Mar 2019 03:41:40 PM EST
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ cat Split.java 
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
  public static void splitter(String theString, int pos, String[] results){
    results[0] = theString.substring(0, pos);
    results[1] = theString.substring(pos, theString.length());
  } 


}
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ javac -deprecation Split. 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ java Split. 

To split a string, enter the string: 
Hello

Enter the split position: 
0

The first part is 
 and the second part is Hello
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ java Split

To split a string, enter the string: 
Hello

Enter the split position: 
3

The first part is Hel
 and the second part is lo
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ java Split

To split a string, enter the string: 
Hello

Enter the split position: 
5

The first part is Hello
 and the second part is 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ exit

Script done on Sat 02 Mar 2019 03:42:43 PM EST