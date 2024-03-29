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
