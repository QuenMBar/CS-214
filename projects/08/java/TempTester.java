import java.util.Scanner;

/* TempTester.java is a 'driver' to test class Tempature.
 * Student: Quentin Barnes
 * Date: May 9, 2019
 ************************************************************/

public class TempTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Degrees for Base Temp: ");
        Double baseDegrees = keyboard.nextDouble();
        System.out.print("Enter Scale For Base Temp: ");
        String baseScale = keyboard.next();
        System.out.print("Enter Limit Temp (Degrees and Scale): ");
        Double limitTempDouble = keyboard.nextDouble();
        String limitTempString = keyboard.next();
        System.out.print("Enter step value: ");
        Double stepVal = keyboard.nextDouble();
        keyboard.close();

        // System.out.println(baseDegrees + " " + baseScale + " " + limitTempDouble + "
        // " + limitTempString);
        Tempeture baseTemp = new Tempeture(baseDegrees, baseScale);
        Tempeture limitTemp = new Tempeture(limitTempDouble, limitTempString);
        // System.out.println(baseTemp.getTemp() + " " + limitTemp.getTemp());

        System.out.println(baseTemp.getTemp() + "\n");

        while (baseTemp.lessThan(limitTemp) && !(baseTemp.equals(limitTemp))) {
            baseTemp.raise(stepVal);
            System.out.println(baseTemp.getTemp());
        }
    }
}
