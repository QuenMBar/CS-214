Script started on Mon 06 May 2019 11:25:01 PM EDT
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/09/java$ cat Find.java 

/* Find.java finds a value in Java linked lists.
 *
 * Begun by: Dr. Adams, CS 214 at Calvin College.
 * Completed by: Quentin Barnes
 * Date: May 6, 2019
 */

import java.util.LinkedList;
import java.util.Iterator;

public class Find {

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    LinkedList<Integer> list2 = new LinkedList<Integer>();
    LinkedList<Integer> list3 = new LinkedList<Integer>();
    LinkedList<Integer> list4 = new LinkedList<Integer>();

    list1.add(99); // 99, 88, 77, 66, 55
    list1.add(88); // 99 is first
    list1.add(77);
    list1.add(66);
    list1.add(55);

    list2.add(55); // 55, 66, 77, 88, 99
    list2.add(66); // 99 is last
    list2.add(77);
    list2.add(88);
    list2.add(99);

    list3.add(55); // 55, 77, 99, 88, 66
    list3.add(77); // 99 is in the middle
    list3.add(99);
    list3.add(88);
    list3.add(66);

    list4.add(55); // 55, 77, 45, 88, 66
    list4.add(77); // 99 doesnt exist
    list4.add(45);
    list4.add(88);
    list4.add(66);

    print(list1);
    print(list2);
    print(list3);
    print(list4);

    System.out.println("list1: 99's position is: " + search(list1, 99));
    System.out.println("list2: 99's position is: " + search(list2, 99));
    System.out.println("list3: 99's position is: " + search(list3, 99));
    System.out.println("list4: 99's position is: " + search(list4, 99));
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

  /**
   * search() finds the position of a value in a list.
   *
   * @param: aList, a LinkedList<Integer>. aValue, an Integer
   * @return: postion, an Integer
   */
  public static Integer search(LinkedList<Integer> aList, Integer aValue) {
    Iterator<Integer> listIterator = aList.iterator();
    Integer position = -1;
    Integer currentPosition = 0;
    while (listIterator.hasNext()) {
      if (listIterator.next().compareTo(aValue) == 0) {
        position = currentPosition;
      }
      currentPosition++;
    }
    return position;
  }

}
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/09/java$ make
javac -deprecation Find.java
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/09/java$ java f Find. 
99 88 77 66 55 
55 66 77 88 99 
55 77 99 88 66 
55 77 45 88 66 
list1: 99's position is: 0
list2: 99's position is: 4
list3: 99's position is: 2
list4: 99's position is: -1
qmb2@gold29:~/Desktop/GitStuff/Git 363/CS-214/projects/09/java$ exit

Script done on Mon 06 May 2019 11:26:23 PM EDT
