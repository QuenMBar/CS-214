Script started on Sat 13 Apr 2019 07:59:07 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ exitcat NameTester.java 
/* NameTester.java is a 'driver' to test class Name.
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Student: Quentin Barnes
 * Date: April 13, 2019
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
};
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ make java
javac -deprecation NameTester.java
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ java -ea NameTester. 
John Paul Jones
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/07$ exit
exit

Script done on Sat 13 Apr 2019 07:59:38 PM EDT
