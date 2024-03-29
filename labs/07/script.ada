Script started on Sat 13 Apr 2019 08:58:23 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ cat name_tester.adb 
-- namer.adb "test-drives" the Name type.
-- Begun by: Prof. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: April 13, 2019
----------------------------------------------

with Ada.Text_IO; use Ada.Text_IO;

procedure name_tester is

  NAME_SIZE : Integer := 8;

type Name is
  record

    myFirst, myMiddle, myLast : String( 1..NAME_SIZE );

  end record;

  ----------------------------------------------
  -- Init initializes a Name variable          -
  -- Receive: theName, the Name variable;      -
  --          First, the first name;           -
  --          Middle, the middle name;         -
  --          Last, the last name.             -
  -- Return: theName, its fields set to First, -
  --               Middle, and Last.           -
  ----------------------------------------------

  procedure Init(TheName: out Name;
                 First, Middle, Last : in String) is

  begin
    TheName.MyFirst := First;
    TheName.MyMiddle := Middle;
    TheName.MyLast := Last;
  end Init;


  ----------------------------------------------
  -- getFirst(Name) retrieves Name.myFirst        -
  -- Receive: theName, a Name.                 -
  -- PRE: theName has been initialized.        -
  -- Return: theName.myFirst.                  -
  ----------------------------------------------

  function getFirst(TheName : in Name) return String is
   begin
      return TheName.MyFirst;
   end getFirst;


  function getMiddle(TheName : in Name) return String is
   begin
      return TheName.MyMiddle;
   end getMiddle;


  function getLast(TheName : in Name) return String is
   begin
      return TheName.MyLast;
   end getLast;


  -----------------------------------------------
  -- getFullName(Name) retrieves Name as a String  -
  -- Receive: theName, a Name.                  -
  -- PRE: theName has been initialized.         -
  -- Return: a String representation of theName -
  -----------------------------------------------

  function getFullName(TheName : in Name) return String is
   begin
      return TheName.MyFirst & " " & TheName.myMiddle & " " & TheName.myLast;
   end getFullName;

  ----------------------------------------------
  -- Put(Name) displays a Name value.          -
  -- PRE: theName has been initialized.        -
  -- Receive: theName, a Name.                 -
  -- Output: theName, to the screen.           -
  ----------------------------------------------

  procedure Put(TheName : in Name) is
    begin
      Put(getFullName(TheName));
  end Put;


  aName : Name;

begin

  Init(aName, "John    ", "Paul    ", "Jones   ");

  pragma Assert( getFirst(aName) = "John    ", "getFirst() failed");
  pragma Assert( getMiddle(aName) = "Paul    ", "getMiddle() failed");
  pragma Assert( getLast(aName) = "Jones   ", "getLast() failed");
  pragma Assert( getFullName(aName) = "John     Paul     Jones   ", 
                   "getFullName() failed");

  Put(aName); New_line;
   Put("All tests passed!"); New_line;

end name_tester;

qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ make ada
gnatmake name_tester -gnata
gcc-5 -c -gnata name_tester.adb
gnatbind-5 -x name_tester.ali
gnatlink-5 name_tester.ali
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ ./name_tester 
John     Paul     Jones   
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ exit
exit

Script done on Sat 13 Apr 2019 08:58:42 PM EDT
