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
