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
     * A Duck's Call Return: a duck-call ("Quack!").
     */

    public String getMovement() {
        return "walked past";
    }

}