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

