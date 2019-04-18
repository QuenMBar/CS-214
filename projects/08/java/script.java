Script started on Sat 13 Apr 2019 09:51:18 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/java$ cat NameTester.jave a
/* NameTester.java is a 'driver' to test class Name.
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Student: Quentin Barnes
 * Date: April 13, 2019
 ************************************************************/

public class NameTester {
    public static void main(String[] args) {
        Name aName = new Name("John", "Paul", "Jones");

        assert aName.getFirst().equals("John");
        assert aName.getMiddle().equals("Paul");
        assert aName.getLast().equals("Jones");

        System.out.println(aName);
        assert aName.toString().equals("John Paul Jones");

        System.out.println("All tests passed!");
    }
}
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/java$ cat Name.java
/* Name.java implements class Name.
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Student: Quentin Barnes
 * Date: April 13, 2019
 ************************************************************/

// the Name class appears outside of the rest of the program
class Name {

    // Name object constructor with initialization
    public Name(final String first, final String middle, final String last) {
        myFirst = first;
        myMiddle = middle;
        myLast = last;
    }

    // extractor for first name of a Name object
    public final String getFirst() {
        return myFirst;
    }

    // extractor for middle name of a Name object
    public final String getMiddle() {
        return myMiddle;
    }

    // extractor for last name of a Name object
    public final String getLast() {
        return myLast;
    }

    // return string created by piecing together first, middle, and last names
    public final String toString() {
        return myFirst + ' ' + myMiddle + ' ' + myLast;
    }

    private String myFirst, myMiddle, myLast; // private instance variables
}qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/java$ make
javac -deprecation Name.java
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/java$ java NameTester. 
John Paul Jones
All tests passed!
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/08/java$ we  exit
exit

Script done on Sat 13 Apr 2019 09:52:09 PM EDT
