Script started on Sat 23 Feb 2019 07:03:17 PM EST
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/labs/04$ cat log_table.adb
-- log_table.adb computes a table of logarithms.
--
-- Input: start, stop, increment, three reals.
-- Precondition: increment is positive.
-- Output: A table of logarithms beginning with log(start),
--         ending with log(stop), with intervals of increment.
--
-- Begun by: Prof. Adams, for CS 214 at Calvin College.
-- Completed by: Quentin Barnes on Feb 23, 2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO, Ada.Numerics.Elementary_Functions;
use  Ada.Text_IO, Ada.Float_Text_IO, Ada.Numerics.Elementary_Functions;

procedure log_table is

   Start, Stop, Increment : Float;

begin                                           -- Prompt for input
   Put_Line("To print a table of logarithms,");
   Put(" enter the start, stop, and increment values: ");
   Get(Start); Get(Stop); Get(Increment);

   while start <= stop loop
      Put("The logarithm of ");
      Put(start);
      Put(" is ");
      Put(log(start, 10.0));
      Put_Line(" ");
      start := start + increment;
   end loop;

end log_table;

qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/labs/04$ gnatmake log_table
gcc-5 -c log_table.adb
gnatbind-5 -x log_table.ali
gnatlink-5 log_table.ali
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/labs/04$ ./log_table 
To print a table of logarithms,
 enter the start, stop, and increment values: 1
10
. 0.5
The logarithm of  1.00000E+00 is  0.00000E+00 
The logarithm of  1.50000E+00 is  1.76091E-01 
The logarithm of  2.00000E+00 is  3.01030E-01 
The logarithm of  2.50000E+00 is  3.97940E-01 
The logarithm of  3.00000E+00 is  4.77121E-01 
The logarithm of  3.50000E+00 is  5.44068E-01 
The logarithm of  4.00000E+00 is  6.02060E-01 
The logarithm of  4.50000E+00 is  6.53212E-01 
The logarithm of  5.00000E+00 is  6.98970E-01 
The logarithm of  5.50000E+00 is  7.40363E-01 
The logarithm of  6.00000E+00 is  7.78151E-01 
The logarithm of  6.50000E+00 is  8.12913E-01 
The logarithm of  7.00000E+00 is  8.45098E-01 
The logarithm of  7.50000E+00 is  8.75061E-01 
The logarithm of  8.00000E+00 is  9.03090E-01 
The logarithm of  8.50000E+00 is  9.29419E-01 
The logarithm of  9.00000E+00 is  9.54243E-01 
The logarithm of  9.50000E+00 is  9.77724E-01 
The logarithm of  1.00000E+01 is  1.00000E+00 
qmb2@gold27:~/Desktop/GitStuff/Git 363/CS-214/labs/04$ exit

Script done on Sat 23 Feb 2019 07:04:13 PM EST
