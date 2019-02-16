Script started on Sat 16 Feb 2019 05:21:30 PM EST
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ cat year_codes.adb
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

procedure year_codes is

   year : String(1..9) := "         ";
   charsRead : Natural;

   function yearCode(year: in string) return integer is 
   begin
      if (year = "freshman ") then
         return 1;
      elsif (year = "sophomore") then
         return 2;
      elsif (year = "junior   ") then
         return 3;
      elsif (year = "senior   ") then
         return 4;
      else
         return 0;
      end if;
   end yearCode;

begin                                          
   Put("Enter your academic year: ");           -- Prompt for input
   Get_Line(year, charsRead);                   -- Input
   Put( yearCode(year) );                       -- Convert and output
   New_Line;
end year_codes;

qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ gnatmake year_codes
gcc-5 -c year_codes.adb
gnatbind-5 -x year_codes.ali
gnatlink-5 year_codes.ali
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ./year_codes 
Enter your academic year: freshman
          1
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ./year_codes 
Enter your academic year: junior
          3
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ./year_codes 
Enter your academic year: sophomore
          2
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ./year_codes 
Enter your academic year: senior
          4
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ./year_codes 
Enter your academic year: sen
          0
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ ./year_codes 
Enter your academic year: 1
          0
qmb2@gold32:~/Desktop/GitStuff/Git 363/CS-214/labs/03$ exit

Script done on Sat 16 Feb 2019 05:23:40 PM EST
