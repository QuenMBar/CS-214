Script started on Tue 07 May 2019 08:43:56 PM EDT
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ cat Birds.java 
/* Birds.java illustrates inheritance and polymorphism.
 *
 * Begun by: Joel Adams, for CS 214 Lab 10 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 *********************************************************/

public class Birds {

  public static void main(String[] args) {
    System.out.println("\nWelcome to the Bird Park!\n");

    Bird bird0 = new Bird();

    Bird bird1 = new Bird("Hawkeye");
    bird1.print();

    Duck bird2 = new Duck("Donald");
    bird2.print();

    Goose bird3 = new Goose("Mother Goose");
    bird3.print();

    Owl bird4 = new Owl("Woodsey");
    bird4.print();
    System.out.println();
  }
}
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ cat Bird.java 

/* Bird.java provides a Bird class.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

import java.io.*;

public class Bird {

  /*
   * default constructor PostCond: myName == "".
   */

  public Bird() {
    myName = "";
  }

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */

  public Bird(String name) {
    myName = name;
  }

  /*
   * Name accessor Return: myName.
   */

  public String getName() {
    return myName;
  }

  /*
   * A Bird's Call Return: a default bird-call ("Squawk!").
   */

  public String call() {
    return "Squaaaaaaaaaawk!";
  }

  /*
   * Output a Bird Output: Everything known about myself to the standard output
   * stream.
   */

  public void print() {
    System.out.println(getName() + ' ' + getClass().getName() + " says " + call());
  }

  private String myName;
}
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ cat d Duck.java 
/* Duck.java provides a Duck subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Duck extends Bird {

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */

  public Duck() {
    super();
  }

  public Duck(String name) {
    super(name);
  }

  /*
   * A Duck's Call Return: a duck-call ("Quack!").
   */

  public String call() {
    return "Quack!";
  }

}
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ cat Goose.java 
/* Goose.java provides a Goose subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Goose extends Bird {

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */
  public Goose() {
    super();
  }

  public Goose(String name) {
    super(name);
  }

  /*
   * A Goose's Call Return: a goose-call ("Honk!").
   */

  public String call() {
    return "Honk!";
  }

}
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ cat Owl.java 
/* Owl.java provides an Owl subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Owl extends Bird {

  /*
   * explicit constructor Receive: name, a String PostCond: myName == name.
   */

  public Owl() {
    super();
  }

  public Owl(String name) {
    super(name);
  }

  /*
   * An Owl's Call Return: an owl-call ("Whoo-hoo!").
   */

  public String call() {
    return "Whoo-hoo!";
  }

}
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ make
javac -deprecation Birds.java
qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ java bit   Birds

Welcome to the Bird Park!

Hawkeye Bird says Squaaaaaaaaaawk!
Donald Duck says Quack!
Mother Goose Goose says Honk!
Woodsey Owl says Whoo-hoo!

qmb2@gold28:~/Desktop/GitStuff/Git 363/CS-214/labs/10/java$ exit

Script done on Tue 07 May 2019 08:45:23 PM EDT
