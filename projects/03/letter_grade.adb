-- letter_grade.adb converts a grade average to its coresponding letter grade.
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed and Edited by by: Quentin Barnes
-- Date: Feb 23, 2019
--
-- Input: average, a int
-- Precondition: average is <= 100 and >= 0
-- Output: A letter grade A, B, C, D, or F
----------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;

procedure letter_grade is

   averageInString : string(1..3) := "   ";
   average : Integer;
   charsRead : Natural;

   function letterGrade(average: in Integer) return string is 
   begin
      case average/10 is
         when 10    => return "A";
         when 9    => return "A";
         when 8    => return "B";
         when 7    => return "C";
         when 6    => return "D";
  
         when others => return "F";
      end case;
   end letterGrade;

begin                                          
   Put("Enter your grade average: ");           -- Prompt for input
   Get_Line(averageInString, charsRead);                   -- Input
   average := Integer'Value(averageInString);
   Put( letterGrade(average) );                       -- Convert and output
   New_Line;
end letter_grade;

