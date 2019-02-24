Script started on Sat 23 Feb 2019 05:40:52 PM EST
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ cat letter_grade.adb
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

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ gnatmake letter_grade [Aqmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ gnatmake letter_grad[Ke
gcc-5 -c letter_grade.adb
gnatbind-5 -x letter_grade.ali
gnatlink-5 letter_grade.ali
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ./letter_grade 
Enter your grade average: 100
A
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ./letter_grade 
Enter your grade average: 95
A
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ./letter_grade 
Enter your grade average: 81
B
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ./letter_grade 
Enter your grade average: 79
C
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ./letter_grade 
Enter your grade average: 60
D
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ ./letter_grade 
Enter your grade average: 24
F
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/03$ exit

Script done on Sat 23 Feb 2019 05:42:00 PM EST
