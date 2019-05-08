/* Ostrich.java provides a Ostrich subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Ostrich extends WalkingBird {

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */
  public Ostrich() {
    super();
  }

  public Ostrich(String name) {
    super(name);
  }

  /*
   * A Ostrich's Call Return: a Ostrich-call ("Snork!").
   */

  public String call() {
    return "Snork!";
  }

}
