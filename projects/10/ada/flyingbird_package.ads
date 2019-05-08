-- duck_package.ads gives Duck-related declarations,
--
--  and derives Duck from Bird.
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
