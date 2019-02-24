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

