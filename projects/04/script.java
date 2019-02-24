Script started on Sat 23 Feb 2019 08:23:26 PM EST
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ cat NLoop.java
/* NLoop.java computes the factorial of a given number..
 *
 * Input: n, an int.
 * PRE: n >= 2.
 * Output: The factorial of the inputed number
 * Begun by: Nelesen, for CS 214 at Calvin College.
 * Completed and edited by: Quentin Barnes on Feb 23, 2019
 ********************************************************/
import java.util.Scanner; 		// Get input

class NLoop{

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("To compute n!, enter n: ");
    int n;
    n = keyboard.nextInt();

    System.out.println(n + "! = " + nLoop(n));

  }

  public static double nLoop(int n) {
    double answer = 1.0;
    for (int i = 2; i <= n; i++) {
      answer *= i;
    }
    return answer;
  }
}

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ javac -deprecation NLoop.java
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ java Nl Loop. 
To compute n!, enter n: 
5
5! = 120.0
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ java NLoop
To compute n!, enter n: 
8
8! = 40320.0
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ java NLoop
To compute n!, enter n: 
10
10! = 3628800.0
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ java NLoop
To compute n!, enter n: 
25
25! = 1.5511210043330986E25
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ exit

Script done on Sat 23 Feb 2019 08:24:34 PM EST
