-- n_loop.adb computes the factorial of a given number.
--
-- Input: n, an int.
-- Precondition: n >= 2.
-- Output: The factorial of the inputed number
--
-- Begun by: Prof. Adams, for CS 214 at Calvin College.
-- Completed and edited by: Quentin Barnes on Feb 23, 2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO, Ada.Integer_Text_IO, Ada.Numerics.Elementary_Functions;
use  Ada.Text_IO, Ada.Float_Text_IO, Ada.Integer_Text_IO, Ada.Numerics.Elementary_Functions;

procedure n_loop is

   answer : Float;
   n : Integer;
   function nLoop(n: in Integer) return Float is 
   begin
      answer := 1.0;
      for i in 2..n loop
         answer := answer * Float(i);
      end loop;
      return answer;
   end nLoop;

begin                                           -- Prompt for input
   Put_Line("To compute n!, enter n: ");
   Get(n);
   Put(n);
   Put("! = ");
   Put( nLoop(n) );
   Put_Line(" ");
end n_loop;

