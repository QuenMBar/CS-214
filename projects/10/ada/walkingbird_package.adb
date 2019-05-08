-- duck_package.adb gives Duck-related definitions
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
