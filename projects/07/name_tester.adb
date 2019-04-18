-- namer.adb "test-drives" the Name type.
-- Begun by: Prof. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: April 18, 2019
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

  procedure Init(TheName: out Name; First, Middle, Last : in String) is

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

  ----------------------------------------------
  -- setFirst(Name; String) sets Name.myFirst      -
  -- Receive: theName, a Name and aFirst, a String -
  -- PRE: theName has been initialized.            -
  -- Return: N/A                                   -
  ----------------------------------------------

  procedure setFirst(TheName : out Name; aFirst : in String) is
    begin 
      TheName.MyFirst := aFirst;
  end setFirst;

  procedure setMiddle(TheName : out Name; aMiddle : in String) is
    begin 
      TheName.MyMiddle := aMiddle;
  end setMiddle;

  procedure setLast(TheName : out Name; aLast : in String) is
    begin 
      TheName.MyLast := aLast;
  end setLast;

  -----------------------------------------------
  -- lfmi(Name) retrieves Name as a String in a format -
  -- Receive: theName, a Name.                         -
  -- PRE: theName has been initialized.                -
  -- Return: a String representation of theName        -
  -----------------------------------------------

  function lfmi(TheName : in Name) return String is
   begin
      return TheName.myLast & ", " & TheName.MyFirst & " " & TheName.myMiddle(TheName.myMiddle'First) & ".";
  end lfmi;

  -----------------------------------------------
  -- read(Name) sets Name based on user Input   -
  -- Receive: theName, a Name.                  -
  -- PRE: theName has been initialized.         -
  -- Return: N/A                                -
  -----------------------------------------------

  procedure read(TheName : out Name) is
    aFirst, aMiddle, aLast : String( 1..NAME_SIZE );
    begin 
      Get(aFirst);
      Get(aMiddle);
      Get(aLast);

      theName.myFirst := aFirst;
      theName.myMiddle := aMiddle;
      theName.myLast := aLast;
  end read;

  aName : Name;

begin

  Init(aName, "John    ", "Paul    ", "Jones   ");

  pragma Assert( getFirst(aName) = "John    ", "getFirst() failed");
  pragma Assert( getMiddle(aName) = "Paul    ", "getMiddle() failed");
  pragma Assert( getLast(aName) = "Jones   ", "getLast() failed");
  pragma Assert( getFullName(aName) = "John     Paul     Jones   ", 
                  "getFullName() failed");

  Put(aName); New_line;

  setFirst(aName, "Marwan  ");
  setMiddle(aName, "Peter   ");
  setLast(aName, "Pierce  ");
  pragma Assert( getFullName(aName) = "Marwan   Peter    Pierce  ", 
                  "getFullName() failed");

  pragma Assert( lfmi(aName) = "Pierce  , Marwan   P.", 
                  "lfmi() failed");

  read(aName); -- User Input Is Printed to verify correctness

  Put(aName); New_line;

  Put("All tests passed!"); New_line;

end name_tester;

