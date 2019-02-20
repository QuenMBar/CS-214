-- year_codes.adb converts academic year codes to corresponding years.
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: Feb 15, 2019
--
-- Input: year, a string
-- Precondition: year is one of "freshman", "sophomore", "junior", "senior"
-- Output: The year code (1, 2, 3 or 4) corresponding to year.
----------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;

procedure letter_grade is

   averageInString : string(1..2) := "  ";
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
   Put("Enter your academic year: ");           -- Prompt for input
   Get_Line(averageInString, charsRead);                   -- Input
   average := Integer'Value(averageInString);
   Put( letterGrade(average) );                       -- Convert and output
   New_Line;
end letter_grade;

