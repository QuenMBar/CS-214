Script started on Sat 23 Feb 2019 08:24:47 PM EST
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ cat n_loop.adb
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

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ gnatmake n_loop
gcc-5 -c n_loop.adb
gnatbind-5 -x n_loop.ali
gnatlink-5 n_loop.ali
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ./n_loop 
To compute n!, enter n: 
5
          5! =  1.20000E+02 
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ./n_loop 
To compute n!, enter n: 
8
          8! =  4.03200E+04 
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ./n_loop 
To compute n!, enter n: 
10
         10! =  3.62880E+06 
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ ./n_loop 
To compute n!, enter n: 
25
         25! =  1.55112E+25 
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/projects/04$ exit

Script done on Sat 23 Feb 2019 08:26:09 PM EST
