Script started on Tue 05 Mar 2019 08:46:56 PM EST
cat Q			^Cqmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ git push origin master[1Pcommit -m "Lab05"push origin master[Kgit push origin master[K
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ script script.java
Script started, file is script.java
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ car t QuadraticRoots.java 

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
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ javac -deprecation QuadraticRoots.java 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ java QuadraticRoots. 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 
3

Enter b: 
12

Enter c: 
8

The first root is: -0.8452994616207485
 and the second root is: -3.154700538379251
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ java QuadraticRoots

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 
0

Enter b: 
8

Enter c: 
9

*** QuadraticRoots(): a is zero!

The first root is: 0.0
 and the second root is: 0.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ java QuadraticRoots

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 
5

Enter b: 
1

Enter c: 
5

*** quadraticRoots(): b^2 - 4ac is negative!

The first root is: 0.0
 and the second root is: 0.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ java QuadraticRoots

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 
2

Enter b: 
8

Enter c: 
6

The first root is: -1.0
 and the second root is: -3.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ exit
Script done, file is script.java
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ script script.ada
Script started, file is script.ada
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ cat quadratic_roots.ada b
-- QuadraticRoots.java is a program for finding the roots of a quadratic 
-- function y = ax^2 + bx + c where a, b, c are given by the user.
-- 
-- Input: a, b, c as floats.
-- Output: the roots of y = ax^2 + bx + c with the users variables.
-- 
-- Written by: Quentin Barnes on March 5, 2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO, Ada.Numerics.Elementary_Functions;
use  Ada.Text_IO, Ada.Float_Text_IO, Ada.Numerics.Elementary_Functions;

procedure quadratic_roots is

   aIn, bIn, cIn, root1, root2: Float;

   ------------------------------------------------
   -- 
   -- quadraticRoots() finds the roots of a quadratic 
   -- function y = ax^2 + bx + c
   -- Receive: a, b, c as floats                  
   -- Passback: roots 1 and 2 of the function
   ------------------------------------------------
   procedure quadratcRoots (a: in Float; b: in Float; c: in Float; Root_First: out Float; Root_Second: out Float) is
   arg: Float;
   begin
   if a /= 0.0 then
      arg := b**2.0 - 4.0 * a * c;
      if arg >= 0.0 then
         Root_First := (-b + Sqrt(arg)) / (2.0 * a);
         Root_Second := (-b - Sqrt(arg)) / (2.0 * a);
      else
         Put_Line("*** quadraticRoots(): b^2 - 4ac is negative!");
         Root_First := 0.0;
         Root_Second := 0.0;
      end if;
   else
      Put_Line("*** QuadraticRoots(): a is zero!");
      Root_First := 0.0;
      Root_Second := 0.0;
   end if;

   end quadratcRoots;


begin                                           -- Prompt for input
   Put_Line("To compute the roots of a quadratic equation given");
   Put_Line("an equasion of the form: y = ax^2 + bx + c");
   Put("Enter a: ");
   Get(aIn);
   Put("Enter b: ");
   Get(bIn);
   Put("Enter c: ");
   Get(cIn);

   quadratcRoots(aIn, bIn, cIn, root1, root2);

   Put("The first root is: ");
   Put(root1);
   Put_Line(" ");
   Put(" and the second root is: ");
   Put(root2);
   Put_Line(" ");

end quadratic_roots;

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ gnatmake quadratic_roots.adb
gcc-5 -c quadratic_roots.adb
gnatbind-5 -x quadratic_roots.ali
gnatlink-5 quadratic_roots.ali
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ./quadratic_roots 
To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c
Enter a: 3
Enter b: 12
Enter c: 8
The first root is: -8.45299E-01 
 and the second root is: -3.15470E+00 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ./quadratic_roots 
To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c
Enter a: 0
Enter b: 8
Enter c: 9
*** QuadraticRoots(): a is zero!
The first root is:  0.00000E+00 
 and the second root is:  0.00000E+00 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ./quadratic_roots 
To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c
Enter a: 5
Enter b: 1
Enter c: 5
*** quadraticRoots(): b^2 - 4ac is negative!
The first root is:  0.00000E+00 
 and the second root is:  0.00000E+00 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ./quadratic_roots 
To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c
Enter a: 2
Enter b: 8
Enter c: 6
The first root is: -1.00000E+00 
 and the second root is: -3.00000E+00 
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ exit
Script done, file is script.ada
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ script script.ruby
Script started, file is script.ruby
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ cat quadraticRoots.rb 
# QuadraticRoots.rb is a program for finding the roots of a quadratic 
# function y = ax^2 + bx + c where a, b, c are given by the user.
#
# Input: a, b, c as doubles.
# Output: the roots of y = ax^2 + bx + c with the users variables.
#
# Written by: Quentin Barnes on March 5, 2019
#################################################################


# quadraticRoots() finds the roots of a quadratic 
# function y = ax^2 + bx + c
# Receive: a, b, c as doubles                  
# Return: roots 1 and 2 of the function
######################################################

def quadraticRoots(a, b, c)
  if a != 0 then
    arg = b**2 - 4 * a * c
    if arg >= 0 then
      quadRoots =  Array[(-b + Math.sqrt(arg)) / (2 * a), (-b - Math.sqrt(arg)) / (2 * a)]
    else
      puts "*** quadraticRoots(): b^2 - 4ac is negative!"
      quadRoots =  Array[0.0, 0.0]
    end
  else
    puts "*** QuadraticRoots(): a is zero!"
    quadRoots =  Array[0.0, 0.0]
  end
end


def main
  print "\nTo compute the roots of a quadratic equation given\nan equasion of the form: y = ax^2 + bx + c \nEnter a: "
  aIn = gets.to_f
  print "Enter b: "
  bIn = gets.to_f
  print "Enter c: "
  cIn = gets.to_f
  quad_roots = quadraticRoots(aIn, bIn, cIn)
  print "The first part is: "
  puts quad_roots[0]
  print "and the second part is: "
  puts quad_roots[1]
end

main
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 3
Enter b: 12
Enter c: 8
The first part is: -0.8452994616207485
and the second part is: -3.154700538379251
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 0
Enter b: 8
Enter c: 9
*** QuadraticRoots(): a is zero!
The first part is: 0.0
and the second part is: 0.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 5
Enter b: 1
Enter c: 5
*** quadraticRoots(): b^2 - 4ac is negative!
The first part is: 0.0
and the second part is: 0.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ ruby quadraticRoots.rb 

To compute the roots of a quadratic equation given
an equasion of the form: y = ax^2 + bx + c 
Enter a: 2
Enter b: 8
Enter c: 6
The first part is: -1.0
and the second part is: -3.0
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ exit
Script done, file is script.ruby
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ script script.ruby[Kcd clojure/
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ script script.clojure
Script started, file is script.clojure
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ cat src/quadratic_roots.clj 
;;; QuadraticRoots.java is a program for finding the roots of a quadratic 
;;; function y = ax^2 + bx + c where a, b, c are given by the user.
;;;
;;; Input: a, b, c as floats.
;;; Output: the roots of y = ax^2 + bx + c with the users variables.
;;;
;;; Written by: Quentin Barnes on March 5, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns quadratic_roots)      ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; quadraticRoots() finds the roots of a quadratic 
;;; function y = ax^2 + bx + c
;;; Receive: a, b, c as doubles                  
;;; Return: roots 1 and 2 of the function
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn quadraticRoots [a b c]
  (if (not= a 0)
    (let
      [arg (- (Math/pow b 2) (* 4 (* a c)))]
      (if (>= arg 0)
        (let
          [firstRoot (/ (+ (* b -1) (Math/sqrt arg)) (* 2 a))
          secondRoot (/ (- (* b -1) (Math/sqrt arg)) (* 2 a))]

          (vector firstRoot secondRoot)
        )
        (let 
          [firstRoot (- 0.0 0.0)
          secondRoot (- 0.0 0.0)]
          (printf "*** quadraticRoots(): b^2 - 4ac is negative!") (flush)

          (vector firstRoot secondRoot)
        )
      )
    )
    (let
      [firstRoot (- 0.0 0.0)
      secondRoot (- 0.0 0.0)]
      (printf "*** QuadraticRoots(): a is zero!") (flush)

      (vector firstRoot secondRoot)
    )
  )
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; main function
;;; Input: a, b, c as doubles.
;;; Output: the roots of y = ax^2 + bx + c with the users variables
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
  (print "To compute the roots of a quadratic equation given an equasion of the form: y = ax^2 + bx + c, Enter a:") (flush)
  (let
    [ aIn (read) ]                      ; read the double a
    (print "Enter b: ") (flush)
    (let 
      [ bIn (read) ]                     ; read the double b
      (print "Enter c: ") (flush)
      (let 
        [ cIn (read)                      ; read the double c
          result (quadraticRoots aIn bIn cIn)               ; Find the roots
          root1 (get result 0)                              ; retrieve the two
          root2 (get result 1)                              ; parts
        ]
                                                 
        (printf (str "\nThe first part is \"%f\" and"       ; display the parts
                      " the second part is \"%f\"\n\n")
                        root1 root2)
      )
    )
  )
)

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ clure   ojure -m quadratic_roots
To compute the roots of a quadratic equation given an equasion of the form: y = ax^2 + bx + c, Enter a:3
Enter b: 12
Enter c: 8

The first part is "-0.845299" and the second part is "-3.154701"

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ clojure -m quadratic_roots
To compute the roots of a quadratic equation given an equasion of the form: y = ax^2 + bx + c, Enter a:0
Enter b: 8
Enter c: 6 9
*** QuadraticRoots(): a is zero!
The first part is "0.000000" and the second part is "0.000000"

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ clojure -m quadratic_roots
To compute the roots of a quadratic equation given an equasion of the form: y = ax^2 + bx + c, Enter a:5
Enter b: 1
Enter c: 5
*** quadraticRoots(): b^2 - 4ac is negative!
The first part is "0.000000" and the second part is "0.000000"

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ clojure -m quadratic_roots
To compute the roots of a quadratic equation given an equasion of the form: y = ax^2 + bx + c, Enter a:2
Enter b: 8
Enter c: 6

The first part is "-1.000000" and the second part is "-3.000000"

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ exit
Script done, file is script.clojure
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ [Kqmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ cat script.java script.ada script.clojure script.ruby > lab05-results[1P[1P[1P[1@p[1@r[1@o[1@j
cat: script.java: No such file or directory
cat: script.ada: No such file or directory
cat: script.clojure: No such file or directory
cat: script.ruby: No such file or directory
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ [Kqmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05/clojure$ cd ..
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ cd ..at script.java script.ada script.clojure script.ruby > proj05-results
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ a2ps proj05-results 
[proj05-results (plain): 7 pages on 4 sheets]
request id is Calvin_UniFLOW-18 (0 file(s))
[Total: 7 pages on 4 sheets] sent to the default printer
[28 lines wrapped]
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/projects/05$ exit
