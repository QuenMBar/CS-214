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

