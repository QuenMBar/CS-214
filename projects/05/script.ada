Script started on Tue 05 Mar 2019 08:49:55 PM EST
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

Script done on Tue 05 Mar 2019 08:51:45 PM EST
