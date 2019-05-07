Script started on Mon 06 May 2019 10:16:31 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/09/java$ cat ma  Max.java 

/* Max.java finds the maximum values in Java linked lists.
 *
 * Begun by: Dr. Adams, CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 6, 2019
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class Max {

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    LinkedList<Integer> list2 = new LinkedList<Integer>();
    LinkedList<Integer> list3 = new LinkedList<Integer>();

    list1.add(99); // 99, 88, 77, 66, 55
    list1.add(88); // max is first
    list1.add(77);
    list1.add(66);
    list1.add(55);

    list2.add(55); // 55, 66, 77, 88, 99
    list2.add(66); // max is last
    list2.add(77);
    list2.add(88);
    list2.add(99);

    list3.add(55); // 55, 77, 99, 88, 66
    list3.add(77); // max is in the middle
    list3.add(99);
    list3.add(88);
    list3.add(66);

    print(list1);
    print(list2);
    print(list3);

    System.out.println("Max of list1: " + Collections.max(list1));
    System.out.println("Max of list2: " + Collections.max(list2));
    System.out.println("Max of list3: " + Collections.max(list3));
  }

  /**
   * print() displays a LinkedList on the console.
   *
   * @param: aList, a LinkedList<Integer>
   * 
   *                Postcondition: the Integer values in aList have been displayed
   *                to System.out, separated by spaces.
   */
  public static void print(LinkedList<Integer> aList) {
    Iterator<Integer> listIterator = aList.iterator();
    while (listIterator.hasNext()) {
      System.out.print(listIterator.next() + " ");
    }
    System.out.print('\n');
  }

}
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/09/java$ make
javac -deprecation Max.java
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/09/java$ java max   Max
99 88 77 66 55 
55 66 77 88 99 
55 77 99 88 66 
Max of list1: 99
Max of list2: 99
Max of list3: 99
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/labs/09/java$ exit

Script done on Mon 06 May 2019 10:17:04 PM EDT
