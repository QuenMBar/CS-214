import java.util.Scanner;

/* NameTester.java is a 'driver' to test class Name.
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Student: Quentin Barnes
 * Date: April 13, 2019
 ************************************************************/

public class TempTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Degrees for Base Temp: ");
        Double baseDegrees = keyboard.nextDouble();
        System.out.print("Enter Scale For Base Temp: ");
        String baseScale = keyboard.next();
        System.out.print("Enter Limit Temp (Degrees and Scale): ");
        String limitTempString = keyboard.next();
        System.out.print("Enter step value: ");
        Double stepVal = keyboard.nextDouble();
        keyboard.close();

        Tempeture baseTemp = new Tempeture(baseDegrees, baseScale);
        Tempeture limitTemp = new Tempeture(limitTempString);

        System.out.println(baseTemp.getTemp() + "\n");

        while (baseTemp.lessThan(limitTemp) && !(baseTemp.equals(limitTemp))) {
            baseTemp.raise(stepVal);
            System.out.println(baseTemp.getTemp() + "\n");
        }
    }
}
