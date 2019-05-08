Script started on Wed 08 May 2019 04:52:51 PM EDT
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Birds.java 
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

    Penguin bird5 = new Penguin("Peter");
    bird5.print();

    Ostrich bird6 = new Ostrich("Orville");
    bird6.print();

    Kiwi bird7 = new Kiwi("Kevin");
    bird7.print();
    System.out.println();
  }
}
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Bird.java 

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
   * A Bird's Call Return: a default bird-movement ("came by").
   */

  public String getMovement() {
    return "came by";
  }

  /*
   * Output a Bird Output: Everything known about myself to the standard output
   * stream.
   */

  public void print() {
    System.out.println(getName() + ' ' + getClass().getName() + " just " + getMovement() + " and said " + call());
  }

  private String myName;
}
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat FlyingBird.jaava 
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

}qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Duck.java 
/* Duck.java provides a Duck subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Duck extends FlyingBird {

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
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Goose.java 
/* Goose.java provides a Goose subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Goose extends FlyingBird {

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
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Owl.java 
/* Owl.java provides an Owl subclass of Bird.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 7, 2019
 ******************************************************/

public class Owl extends FlyingBird {

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
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat WalkingBird.jjava 
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

}qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Penguin.java  
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
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Ostrich.java  
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
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ cat Kiwi.java 
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
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ make
javac -deprecation Birds.java
qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ java Birds

Welcome to the Bird Park!

Hawkeye Bird just came by and said Squaaaaaaaaaawk!
Donald Duck just flew past and said Quack!
Mother Goose Goose just flew past and said Honk!
Woodsey Owl just flew past and said Whoo-hoo!
Peter Penguin just walked past and said Huh-huh-huh-huuuuh!
Orville Ostrich just walked past and said Snork!
Kevin Kiwi just walked past and said Screech!

qmb2@gold22:~/Desktop/GitStuff/Git 363/CS-214/projects/10/java$ exit

Script done on Wed 08 May 2019 04:54:32 PM EDT
