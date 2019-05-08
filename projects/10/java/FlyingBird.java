/* FlyingBird.java provides a FlyingBird subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class FlyingBird extends Bird {

    /*
     * explicit constructor Receive: name, a String PostCond: myName == name.
     */

    public FlyingBird() {
        super();
    }

    public FlyingBird(String name) {
        super(name);
    }

    /*
     * A FlyingBird's Call Return: a FlyingBird-movenent ("flew past!").
     */

    public String getMovement() {
        return "flew past";
    }

}