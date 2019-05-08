Script started on Wed 08 May 2019 04:54:53 PM EDT
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat birds.adb 
-- birds.adb tests our Birds type hierarchy.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
-----------------------------------------------------

with Bird_Package, 
      FlyingBird_Package,
      WalkingBird_Package,
      Duck_Package, 
      Goose_Package,
      Owl_Package,
      Penguin_Package, 
      Ostrich_Package,
      Kiwi_Package,
      Ada.Text_IO;
use Bird_Package,
      FlyingBird_Package,
      WalkingBird_Package,
      Duck_Package, 
      Goose_Package,
      Owl_Package,
      Penguin_Package, 
      Ostrich_Package,
      Kiwi_Package,
      Ada.Text_IO;


procedure Birds is

 Bird1 : Bird_Type;       -- base class
 Bird2 : Duck_Type;       -- derived class 1
 Bird3 : Goose_Type;      -- derived class 2
 Bird4 : Owl_Type;        -- derived class 3
 Bird5 : Penguin_Type;        -- derived class 3
 Bird6 : Ostrich_Type;        -- derived class 3
 Bird7 : Kiwi_Type;        -- derived class 3

begin
   New_Line; Put("Welcome to the Bird Park!"); New_Line;
   Init(Bird1, "Tweety");
   Put(Bird1); New_Line;

   Init(Bird2, "Donald");
   Put(Bird2); New_Line;

   Init(Bird3, "Mother");
   Put(Bird3); New_Line;

   Init(Bird4, "Woodsy");
   Put(Bird4); New_Line;
   
   Init(Bird5, "Peters");
   Put(Bird5); New_Line;

   Init(Bird6, "Orvile");
   Put(Bird6); New_Line;

   Init(Bird7, "Kevins");
   Put(Bird7); New_Line;

 New_Line;
end Birds;

qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat bird_package.aads
-- bird_package.ads gives Bird-related declarations
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

package Bird_Package is
    type Bird_Type is tagged private;

 ----------------------------------------------------
 -- initialization                                  -
 -- Receive: A_Bird, a Bird_Type;                   -
 --          Name, a String                         -
 -- Return: a Bird_Type whose My_Name = Name.       -
 ----------------------------------------------------

 procedure Init(A_Bird : out Bird_Type; Name : in String);

 ----------------------------------------------------
 -- Name accessor                                   -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: A_Bird.My_Name.                         -
 ----------------------------------------------------
function  Name(A_Bird : in Bird_Type) return String;

 ----------------------------------------------------
 -- A Bird's Call                                   -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: a default bird-call ("Squawk!").        -
 ----------------------------------------------------
function  Call(A_Bird : in Bird_Type) return String;

 ----------------------------------------------------
 -- A Bird's Movement                               -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: a default bird-call ("come by").        -
 ----------------------------------------------------
function  Movement(A_Bird : in Bird_Type) return String;

 ----------------------------------------------------
 -- Determine type of a Bird (for derived types)    -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: "Bird".                                 -
 ----------------------------------------------------
function  Type_Name(A_Bird : in Bird_Type) return String;

 ----------------------------------------------------
 -- Output a Bird                                   -
 -- Receive: A_Bird, a Bird or subclass of Bird.    -
 -- Output: Everything known about A_Bird           -
 ----------------------------------------------------
procedure Put(A_Bird : in Bird_Type'Class);

private
    type Bird_Type is
        tagged record
            My_Name : String(1..6);
        end record;

end Bird_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat bird_package.aads b
-- bird_package.adb gives Bird-related definitions
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with Ada.Text_IO;
use Ada.Text_IO;

package body Bird_Package is


 ----------------------------------------------------
 -- initialization                                  -
 -- Receive: A_Bird, a Bird_Type;                   -
 --          Name, a String                         -
 -- Return: a Bird_Type in which My_Name = Name.    -
 ----------------------------------------------------

 procedure Init(A_Bird : out Bird_Type; Name : in String) is
   begin
    A_Bird.My_Name := Name;
   end Init;

 ----------------------------------------------------
 -- Name accessor                                   -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: A_Bird.My_Name.                         -
 ----------------------------------------------------

 function Name(A_Bird : in Bird_Type) return String is
   begin
    return A_Bird.My_Name;
   end Name;

 ----------------------------------------------------
 -- A Bird's Call                                   -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: a default bird-call ("Squawk!").        -
 ----------------------------------------------------
function Call(A_Bird : in Bird_Type) return String is
   begin
    return "Squawwwwwwk!";
   end Call;

 ----------------------------------------------------
 -- A Bird's Movement                               -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: a default bird-call ("come by").        -
 ----------------------------------------------------
function Movement(A_Bird : in Bird_Type) return String is
   begin
    return "came by";
   end Movement;

 ----------------------------------------------------
 -- Determine type of a Bird (for derived types)    -
 -- Receive: A_Bird, a Bird_Type.                   -
 -- Return: "Bird".                                 -
 ----------------------------------------------------
 function Type_Name(A_Bird : in Bird_Type) return String is
   begin
    return "Bird";
   end Type_Name;

 ----------------------------------------------------
 -- Output a Bird                                   -
 -- Receive: A_Bird, a Bird or subclass of Bird.    -
 -- Output: Everything known about A_Bird           -
 ----------------------------------------------------
 procedure Put(A_Bird : in Bird_Type'Class) is
   begin
    Put( Name(A_Bird) );
    Put( ' ' );
    Put( Type_Name(A_Bird) );
    Put( " just " );
    Put( Movement(A_Bird) );
    Put( " and said " );
    Put( Call(A_Bird) );
   end Put; 

end Bird_Package;

qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat flyingbird_pacckage.ads
-- FlyingBird_package.ads gives FlyingBird-related declarations,
--
--  and derives FlyingBird from Bird.
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with Bird_Package; use Bird_Package;

package FlyingBird_Package is

    type FlyingBird_Type is new Bird_Type with private;

    function Movement(A_FlyingBird : in FlyingBird_Type) return String;

private
    type FlyingBird_Type is new Bird_Type with
        record
            null;
        end record;
end FlyingBird_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat flyingbird_pacckage.ads b
-- FlyingBird_package.adb gives FlyingBird-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with Ada.Text_IO;
use Ada.Text_IO;

package body FlyingBird_Package is

function Movement(A_FlyingBird : in FlyingBird_Type) return String is
   begin
    return "flew past";
   end Movement;

end FlyingBird_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat D duck_package.aads
-- duck_package.ads gives Duck-related declarations,
--
--  and derives Duck from Bird.
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with FlyingBird_Package; use FlyingBird_Package;

package Duck_Package is

    type Duck_Type is new FlyingBird_Type with private;
 ----------------------------------------------------
 -- A Duck's Call (Over-rides Bird.Call())          -
 -- Receive: A_Duck, a Duck_Type.                   -
 -- Return: "Quack!"                                -
 ----------------------------------------------------
function  Call(A_Duck : in Duck_Type) return String;

 ------------------------------------------------------------
 -- Determine type of a Duck (Over-rides Bird.Type_Name()) -
 -- Receive: A_Duck, a Duck_Type.                          -
 -- Return: "Duck".                                        -
 -----------------------------------------------------------
function  Type_Name(A_Duck : in Duck_Type) return String;

private
    type Duck_Type is new FlyingBird_Type with
        record
            null;
        end record;
end Duck_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat duck_package.aads b
-- duck_package.adb gives Duck-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with Ada.Text_IO;
use Ada.Text_IO;

package body Duck_Package is

 ----------------------------------------------------
 -- A Duck's Call (Over-rides Bird.Call())          -
 -- Receive: A_Duck, a Duck_Type.                   -
 -- Return: "Quack!"                                -
 ----------------------------------------------------
function Call(A_Duck : in Duck_Type) return String is
   begin
    return "Quack!";
   end Call;

 ------------------------------------------------------------
 -- Determine type of a Duck (Over-rides Bird.Type_Name()) -
 -- Receive: A_Duck, a Duck_Type.                          -
 -- Return: "Duck".                                        -
 -----------------------------------------------------------
function Type_Name(A_Duck : in Duck_Type) return String is
   begin
    return "Duck";
   end Type_Name;

end Duck_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat goose_package..ads
-- goose_package.ads gives Goose-related declarations,
--
--  and derives Goose from Bird.
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with FlyingBird_Package; use FlyingBird_Package;

package Goose_Package is

 type Goose_Type is new FlyingBird_Type with private;


 ----------------------------------------------------
 -- A Goose's Call (Over-rides Bird.Call())         -
 -- Receive: A_Goose, a Goose.                      -
 -- Return: "Honk!"                                 -
 ----------------------------------------------------
function  Call(A_Goose : in Goose_Type) return String;

 -----------------------------------------------------
 -- Determine type of a Goose                        -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: A_Goose, a Goose.                       -
 -- Return: "Goose".                                 -
 -----------------------------------------------------
function  Type_Name(A_Goose : in Goose_Type) return String;

private
    type Goose_Type is new FlyingBird_Type with
        record
            null;
        end record;

end Goose_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat goose_package..ads b
-- goose_package.adb gives Goose-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

package body Goose_Package is

 ----------------------------------------------------
 -- A Goose's Call (Over-rides Bird.Call())         -
 -- Receive: A_Goose, a Goose_Type.                 -
 -- Return: "Honk!"                                 -
 ----------------------------------------------------
function Call(A_Goose : in Goose_Type) return String is
    begin
     return "Honk!";
    end Call;



 -----------------------------------------------------
 -- Determine type of a Goose                        -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: A_Goose, a Goose_Type.                  -
 -- Return: "Goose".                                 -
 -----------------------------------------------------
function Type_Name(A_Goose : in Goose_Type) return String is
    begin
     return "Goose";
    end Type_Name;

end Goose_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat O owl_package.adds
-- owl_package.ads gives Owl-related declarations,
--  and derives Owl from Bird.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with FlyingBird_Package; use FlyingBird_Package;

package Owl_Package is

    type Owl_Type is new FlyingBird_Type with private;

 ----------------------------------------------------
 -- A Owl's Call (Over-rides Bird.Call())           -
 -- Receive: An_Owl, an Owl_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function  Call(A_Owl : in Owl_Type) return String;

 -----------------------------------------------------
 -- Determine type of a Owl                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Owl, an Owl_Type.                    -
 -- Return: "Owl".                                   -
 -----------------------------------------------------
function  Type_Name(A_Owl : in Owl_Type) return String;

private
    type Owl_Type is new FlyingBird_Type with
        record
            null;
        end record;

end Owl_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat owl_package.adds b
-- owl_package.adb gives Owl-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

package body Owl_Package is


 ----------------------------------------------------
 -- A Owl's Call (Over-rides Bird.Call())           -
 -- Receive: An_Owl, an Owl_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function Call(A_Owl : in Owl_Type) return String is
    begin
     return "Whoo-hoo!";
    end Call;

 -----------------------------------------------------
 -- Determine type of a Owl                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Owl, an Owl_Type.                    -
 -- Return: "Owl".                                   -
 -----------------------------------------------------
 function Type_Name(A_Owl : in Owl_Type) return String is
    begin
     return "Owl";
    end Type_Name;

end Owl_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat walkingbird_paackage.ads
-- WalkingBird_Package.ads gives WalkingBird-related declarations,
--
--  and derives WalkingBird from Bird.
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with Bird_Package; use Bird_Package;

package WalkingBird_Package is

    type WalkingBird_Type is new Bird_Type with private;

    function Movement(A_WalkingBird : in WalkingBird_Type) return String;

private
    type WalkingBird_Type is new Bird_Type with
        record
            null;
        end record;
end WalkingBird_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat walkingbird_paackage.ads b
-- WalkingBird_package.adb gives WalkingBird-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with Ada.Text_IO;
use Ada.Text_IO;

package body WalkingBird_Package is

function Movement(A_WalkingBird : in WalkingBird_Type) return String is
   begin
    return "walked past";
   end Movement;

end WalkingBird_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat ostrich_packagge.ads
-- ostrich_package.ads gives Ostrich-related declarations,
--  and derives Ostrich from Bird.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with WalkingBird_Package; use WalkingBird_Package;

package Ostrich_Package is

    type Ostrich_Type is new WalkingBird_Type with private;

 ----------------------------------------------------
 -- A Ostrich's Call (Over-rides Bird.Call())           -
 -- Receive: An_Ostrich, an Ostrich_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function  Call(A_Ostrich : in Ostrich_Type) return String;

 -----------------------------------------------------
 -- Determine type of a Ostrich                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Ostrich, an Ostrich_Type.                    -
 -- Return: "Ostrich".                                   -
 -----------------------------------------------------
function  Type_Name(A_Ostrich : in Ostrich_Type) return String;

private
    type Ostrich_Type is new WalkingBird_Type with
        record
            null;
        end record;

end Ostrich_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat ostrich_packagge.ads b
-- ostrich_package.adb gives Ostrich-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

package body Ostrich_Package is


 ----------------------------------------------------
 -- A Ostrich's Call (Over-rides Bird.Call())           -
 -- Receive: An_Ostrich, an Ostrich_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function Call(A_Ostrich : in Ostrich_Type) return String is
    begin
     return "Snork!";
    end Call;

 -----------------------------------------------------
 -- Determine type of a Ostrich                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Ostrich, an Ostrich_Type.                    -
 -- Return: "Ostrich".                                   -
 -----------------------------------------------------
 function Type_Name(A_Ostrich : in Ostrich_Type) return String is
    begin
     return "Ostrich";
    end Type_Name;

end Ostrich_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat penguin_packagge.ads
-- penguin_package.ads gives Penguin-related declarations,
--  and derives Penguin from Bird.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with WalkingBird_Package; use WalkingBird_Package;

package Penguin_Package is

    type Penguin_Type is new WalkingBird_Type with private;

 ----------------------------------------------------
 -- A Penguin's Call (Over-rides Bird.Call())           -
 -- Receive: An_Penguin, an Penguin_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function  Call(A_Penguin : in Penguin_Type) return String;

 -----------------------------------------------------
 -- Determine type of a Penguin                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Penguin, an Penguin_Type.                    -
 -- Return: "Penguin".                                   -
 -----------------------------------------------------
function  Type_Name(A_Penguin : in Penguin_Type) return String;

private
    type Penguin_Type is new WalkingBird_Type with
        record
            null;
        end record;

end Penguin_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat penguin_packagge.ads b
-- penguin_package.adb gives Penguin-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

package body Penguin_Package is


 ----------------------------------------------------
 -- A Penguin's Call (Over-rides Bird.Call())           -
 -- Receive: An_Penguin, an Penguin_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function Call(A_Penguin : in Penguin_Type) return String is
    begin
     return "Huh-huh-huh-huuuuh!";
    end Call;

 -----------------------------------------------------
 -- Determine type of a Penguin                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Penguin, an Penguin_Type.                    -
 -- Return: "Penguin".                                   -
 -----------------------------------------------------
 function Type_Name(A_Penguin : in Penguin_Type) return String is
    begin
     return "Penguin";
    end Type_Name;

end Penguin_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat kiwi_package.aads
-- kiwi_package.ads gives Kiwi-related declarations,
--  and derives Kiwi from Bird.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

with WalkingBird_Package; use WalkingBird_Package;

package Kiwi_Package is

    type Kiwi_Type is new WalkingBird_Type with private;

 ----------------------------------------------------
 -- A Kiwi's Call (Over-rides Bird.Call())           -
 -- Receive: An_Kiwi, an Kiwi_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function  Call(A_Kiwi : in Kiwi_Type) return String;

 -----------------------------------------------------
 -- Determine type of a Kiwi                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Kiwi, an Kiwi_Type.                    -
 -- Return: "Kiwi".                                   -
 -----------------------------------------------------
function  Type_Name(A_Kiwi : in Kiwi_Type) return String;

private
    type Kiwi_Type is new WalkingBird_Type with
        record
            null;
        end record;

end Kiwi_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ cat kiwi_package.aads b
-- kiwi_package.adb gives Kiwi-related definitions
--  by over-riding Bird-related definitions.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: Quentin Barnes
-- Date: May 7, 2019
---------------------------------------------------

package body Kiwi_Package is


 ----------------------------------------------------
 -- A Kiwi's Call (Over-rides Bird.Call())           -
 -- Receive: An_Kiwi, an Kiwi_Type.                   -
 -- Return: "Whoo!"                                 -
 ----------------------------------------------------
function Call(A_Kiwi : in Kiwi_Type) return String is
    begin
     return "Screech!";
    end Call;

 -----------------------------------------------------
 -- Determine type of a Kiwi                          -
 -- (Over-rides Bird.Type_Name())                    -
 -- Receive: An_Kiwi, an Kiwi_Type.                    -
 -- Return: "Kiwi".                                   -
 -----------------------------------------------------
 function Type_Name(A_Kiwi : in Kiwi_Type) return String is
    begin
     return "Kiwi";
    end Type_Name;

end Kiwi_Package;
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ make
gcc -c  birds.adb
gcc -c  bird_package.adb
gcc -c  flyingbird_package.adb
gcc -c  walkingbird_package.adb
gcc -c  duck_package.adb
gcc -c  goose_package.adb
gcc -c  owl_package.adb
gcc -c  penguin_package.adb
gcc -c  ostrich_package.adb
gcc -c  kiwi_package.adb
gnatbind birds.ali
gnatlink birds.ali
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ ./birds 

Welcome to the Bird Park!
Tweety Bird just came by and said Squawwwwwwk!
Donald Duck just flew past and said Quack!
Mother Goose just flew past and said Honk!
Woodsy Owl just flew past and said Whoo-hoo!
Peters Penguin just walked past and said Huh-huh-huh-huuuuh!
Orvile Ostrich just walked past and said Snork!
Kevins Kiwi just walked past and said Screech!

qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/ada$ exit

Script done on Wed 08 May 2019 04:56:41 PM EDT
