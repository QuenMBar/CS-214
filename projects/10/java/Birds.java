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
