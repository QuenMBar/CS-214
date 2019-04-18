Script started on Thu 18 Apr 2019 07:16:13 PM EDT
cat qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/07$ cat NameTester.java
import java.util.Scanner;

/* NameTester.java is a 'driver' to test class Name.
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Student: Quentin Barnes
 * Date: April 18, 2019
 ************************************************************/

public class NameTester {
  public static void main(String[] args) {
    Name aName = new Name("John", "Paul", "Jones");
    //
    assert aName.getFirst().equals("John");
    assert aName.getMiddle().equals("Paul");
    assert aName.getLast().equals("Jones");
    //
    System.out.println(aName);
    assert aName.toString().equals("John Paul Jones");

    aName.setFirst("Marwan");
    aName.setMiddle("Peter");
    aName.setLast("Pierce");
    assert aName.toString().equals("Marwan Peter Pierce");
    assert aName.lfmi().equals("Pierce, Marwan P.");

    Scanner keyboard = new Scanner(System.in);
    aName.read(keyboard); // User Input Is Printed to verify correctness
    keyboard.close();

    System.out.println(aName);

    System.out.println("All tests passed!");
  }
}

class Name {
  private String myFirst, myMiddle, myLast;

  public Name(String first, String middle, String last) {
    myFirst = first;
    myMiddle = middle;
    myLast = last;
  }

  public String getFirst() {
    return myFirst;
  }

  public String getMiddle() {
    return myMiddle;
  }

  public String getLast() {
    return myLast;
  }

  public String toString() {
    return myFirst + ' ' + myMiddle + ' ' + myLast;
  }

  // Allows the user to set the value of the first name
  // Recives: A String
  public void setFirst(String aFirst) {
    myFirst = aFirst;
  }

  // Allows the user to set the value of the middle name
  // Recives: A String
  public void setMiddle(String aMiddle) {
    myMiddle = aMiddle;
  }

  // Allows the user to set the value of the last name
  // Recives: A String
  public void setLast(String aLast) {
    myLast = aLast;
  }

  // Returns the name in a specific format
  // Returns: A string
  public String lfmi() {
    return myLast + ", " + myFirst + " " + myMiddle.charAt(0) + ".";
  }

  // Reads a name from the keyboard
  // Recives: A scanner
  public void read(Scanner keyboard) {
    System.out.print("Enter First Name: ");
    myFirst = keyboard.next();
    System.out.print("Enter Middle Name: ");
    myMiddle = keyboard.next();
    System.out.print("Enter Last Name: ");
    myLast = keyboard.next();
  }
};
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/07$ make java
javac -deprecation NameTester.java
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/07$ java NameTester. 
John Paul Jones
Enter First Name: James
Enter Middle Name: Jim
Enter Last Name: Jones
James Jim Jones
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/07$ exit
exit

Script done on Thu 18 Apr 2019 07:17:07 PM EDT
