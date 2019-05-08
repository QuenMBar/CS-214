/* Kiwi.java provides a Kiwi subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Kiwi extends WalkingBird {

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */

  public Kiwi() {
    super();
  }

  public Kiwi(String name) {
    super(name);
  }

  /*
   * A Kiwi's Call Return: a Kiwi-call ("Quack!").
   */

  public String call() {
    return "Screech!";
  }

}
