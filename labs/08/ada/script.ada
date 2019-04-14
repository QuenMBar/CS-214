Script started on Sat 13 Apr 2019 10:11:16 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ada$ cat name_package.ads
-- name_package.ads declares the Name type and its operations.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: April 13, 2019
--------------------------------------------------------------

package Name_Package is 
    type Name is private;
    procedure Init(Nm: out Name; First, Middle, Last : in String);
    function getFirst( Nm: in Name) return String;
    function getMiddle( Nm: in Name) return String;
    function getLast( Nm: in Name) return String;
    function getFullName( Nm: in Name) return String;
    procedure Put(Nm: in Name);
private
    NAME_SIZE : constant Positive := 8;
    type Name is
      record
         myFirst,
         myMiddle,
         MyLast : String(1..NAME_SIZE);
      end record;


end Name_Package;qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ada$ cat name_package.adb
-- name_package.adb defines operations for the Name type.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: April 13, 2019
---------------------------------------------------------

with Ada.Text_IO; use Ada.Text_IO;

package body Name_Package is
    ----------------------------------------------
  -- Init initializes a Name variable          
  -- Receive: Nm, the Name variable;          
  --          First, the first name;         
  --          Middle, the middle name;      
  --          Last, the last name.         
  -- Return: Nm, its fields set to First, 
  --               Middle, and Last.     
  ----------------------------------------------

  procedure Init(Nm: out Name;
                 First, Middle, Last : in String) is
  begin
    Nm.MyFirst := First;
    Nm.MyMiddle := Middle;
    Nm.MyLast := Last;
  end Init;

  ----------------------------------------------
  -- getFirst(Name) retrieves Name.myFirst        
  -- Receive: Nm, a Name.                      
  -- PRE: Nm has been initialized.            
  -- Return: Nm.myFirst.                     
  ----------------------------------------------
  function getFirst( Nm: in Name) return String is
  begin
    return Nm.MyFirst;
  end getFirst;

  ----------------------------------------------
  -- getMiddle(Name) retrieves Name as a String 
  -- Receive: Nm, a Name.        
  -- PRE: Nm has been initialized.
  -- Return: Nm.myMiddle. 
  ----------------------------------------------
  function getMiddle( Nm: in Name) return String is
  begin
     return Nm.MyMiddle;
  end getMiddle;

  ----------------------------------------------
  -- getLast(Name) retrieves Name.myLast       
  -- Receive: Nm, a Name.                    
  -- PRE: Nm has been initialized.            
  -- Return: Nm.myLast.                        
  ----------------------------------------------
  function getLast( Nm: in Name) return String is
  begin
     return Nm.MyLast;
  end getLast;

  ----------------------------------------------
  -- getFullName(Name) retrieves Name as a String -
  -- Receive: Nm, a Name.                      -
  -- PRE: Nm has been initialized.             -
  -- Return: a String representation of Nm.    -
  ----------------------------------------------
  function getFullName( Nm: in Name) return String is
  begin
    return Nm.MyFirst & " "
           & Nm.MyMiddle & " "
           & Nm.MyLast;
  end getFullName;

  ----------------------------------------------
  -- Put(Name) displays a Name value.          -
  -- PRE: Nm has been initialized.             -
  -- Receive: Nm, a Name.                      -
  -- Output: Nm, to the screen.                -
  ----------------------------------------------
  procedure Put(Nm: in Name) is
  begin
    Put( getFullName(Nm) );
  end Put;

end Name_Package;qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ada$ cat name_tester.adb 
-- name_tester.adb "test-drives" the Name type.
--
-- Begun by: Dr. Adams, CPSC 280, October 1999.
-- Completed by: Quentin Barnes
-- Date: April 13, 2019
----------------------------------------------

with Ada.Text_IO; with Name_Package; use Ada.Text_IO; use Name_Package;

procedure name_tester is

  aName : Name_Package.Name;

begin
   Init(aName, "John    ", "Paul    ", "Jones   ");

   pragma Assert( getFirst(aName) = "John    ",
                   "getFirst() failed");
   pragma Assert( getMiddle(aName) = "Paul    ", 
                   "getMiddle() failed");
   pragma Assert( getLast(aName) = "Jones   ", 
                   "getLast() failed");
   pragma Assert( getFullName(aName) = "John     Paul     Jones   ",
                    "getFullName() failed");
   Put(aName); New_line;
   Put("All tests passed!"); New_line;
end name_tester;

qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ada$ make
gcc -c -gnata name_tester.adb
gcc -c -gnata name_package.adb
gnatbind name_tester.ali
gnatlink name_tester.ali
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ada$ ./name_tester 
John     Paul     Jones   
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/ada$ exit
exit

Script done on Sat 13 Apr 2019 10:12:39 PM EDT
