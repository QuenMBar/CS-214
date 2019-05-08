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
     * A Duck's Call Return: a duck-call ("Quack!").
     */

    public String getMovement() {
        return "flew past";
    }

}