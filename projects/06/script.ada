Script started on Thu 14 Mar 2019 08:18:42 PM EDT
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ cat array_processing.adb 
--  array_processing.adb allows the user to enter an array and print the entered array

--  Student Name: Quentin Barnes
--  Date: 3/14/19

--  Recive: the values of an array
--  Output: the entered array
-----------------------------------------------

with Ada.Text_IO; use Ada.Text_IO;             -- Put(String)
with Ada.Float_Text_IO; use Ada.Float_Text_IO; -- Put(Float)
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO; -- Get(Integer)

procedure array_processing is

-- Declare Vector type
type Vector is array (Positive range <>) of Float;

theSize : Positive;



-- printArray() is a function that prints an array that it is given based on the
-- size it is given 
-- Recives: An array and its size

procedure printArray( anArray: in Vector; anSize: in Integer ) is
begin
   for i in 1..anSize loop
      Put(anArray(i));
      Put_Line(" ");
   end loop;
end printArray;


-- readArray() is a function that lets the user enter values into an array
-- Recives: An array and its size
procedure readArray( anArray: out Vector; anSize: in Integer ) is
enteredVal: Float;
begin
   for i in 1..anSize loop
      Put("Enter value ");
      Put(i);
      Put(": ");
      Get(enteredVal);
      anArray(i) := enteredVal;
   end loop;
end readArray;


begin
   Put("Enter the size of the array: ");
   Get(theSize);

   declare
      theArray : Vector(1..theSize);

   begin
      readArray(theArray, theSize);


      Put_Line("Enter the array entered is: ");
      printArray(theArray, theSize);
   end;
end array_processing;

qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ gnatmake array_processing.adb 
gcc-5 -c array_processing.adb
gnatbind-5 -x array_processing.ali
gnatlink-5 array_processing.ali
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ ./array_processing 
Enter the size of the array: 6
Enter value           1: 3.52
Enter value           2: 4.6
Enter value           3: 7
Enter value           4: 0.1
Enter value           5: 41 .1
Enter value           6: 2
Enter the array entered is: 
 3.52000E+00 
 4.60000E+00 
 7.00000E+00 
 1.00000E-01 
 4.10000E+00 
 2.00000E+00 
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/projects/06$ exit

Script done on Thu 14 Mar 2019 08:19:48 PM EDT
