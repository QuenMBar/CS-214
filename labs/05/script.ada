Script started on Sat 02 Mar 2019 03:45:35 PM EST
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ catr  split.adb
-- split.adb splits an input string about a specified position.
--
-- Input: Astring, a string,
--        Pos, an integer.
-- Precondition: pos is in Astring'Range.
-- Output: The substrings Astring(Astring'First..Pos-1) and
--                        Astring(Pos..Astring'Last).
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed by: Quentin Barnes on March 2, 2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO, Ada.Strings.Fixed;
use  Ada.Text_IO, Ada.Integer_Text_IO, Ada.Strings.Fixed;

procedure split is

   EMPTY_STRING : String := "                                        ";

   Astring, Part1, Part2 : String  := EMPTY_STRING;
   Pos, Chars_read       : Natural;

   ------------------------------------------------
   --  split() splits a string in two.           
   -- Receive: The_String, the string to be split,
   --          Position, the split index.        
   -- PRE: 0 < Position <= The_String.length(). 
   --     (Ada arrays are 1-relative by default)
   -- Passback: First_Part - the first substring,
   --           Last_Part - the second substring.
   ------------------------------------------------
   procedure split (theString: in String; Posit: in Natural; First_Part: out String; Last_Part: out String) is
   begin
      -- Move(Astring(Astring'First, Pos), Part1);
      -- Move(Astring(Pos, Astring'Last), Part2);

      Move(theString(theString'First .. Posit), First_Part);
      Move(theString((Posit + 1) .. theString'Last), Last_Part);
   end split;


begin                                           -- Prompt for input
   Put("To split a string, enter the string: ");
   Get_Line(Astring, Chars_Read);
   Put("Enter the split position: ");
   Get(Pos);

   split(Astring, Pos, Part1, Part2);

   Put("The first part is ");
   Put_Line(Part1);
   Put(" and the second part is ");
   Put_Line(Part2);

end split;

qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ gam  natmake split
gnatmake: "split" up to date.
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ ./split
To split a string, enter the string: Hello
Enter the split position: 0
The first part is                                         
 and the second part is Hello                                   
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ ./split
To split a string, enter the string: Hello
Enter the split position: 3
The first part is Hel                                     
 and the second part is lo                                      
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ ./split
To split a string, enter the string: Hello
Enter the split position: 5
The first part is Hello                                   
 and the second part is                                         
qmb2@gold05:~/Desktop/GitStuff/Git 363/CS-214/labs/05$ exit

Script done on Sat 02 Mar 2019 03:46:22 PM EST
