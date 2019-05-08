/* WalkingBird.java provides a WalkingBird subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class WalkingBird extends Bird {

    /*
     * explicit constructor Receive: name, a String PostCond: myName == name.
     */

    public WalkingBird() {
        super();
    }

    public WalkingBird(String name) {
        super(name);
    }

    /*
     * A WalkingBird's Call Return: a WalkingBird-call ("walked past!").
     */

    public String getMovement() {
        return "walked past";
    }

}