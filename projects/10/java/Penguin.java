/* Penguin.java provides an Penguin subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Penguin extends WalkingBird {

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */

  public Penguin() {
    super();
  }

  public Penguin(String name) {
    super(name);
  }

  /*
   * An Penguin's Call Return: an Penguin-call ("Huh-huh-huh-huuuuh!").
   */

  public String call() {
    return "Huh-huh-huh-huuuuh!";
  }

}
