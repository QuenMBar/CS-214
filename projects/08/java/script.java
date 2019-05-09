Script started on Thu 09 May 2019 03:56:44 PM EDT
qmb2@gold34:~/Desktop/GitStuff/CS-214/projects/08/java$ cat Tempt Tester.java 
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
qmb2@gold34:~/Desktop/GitStuff/CS-214/projects/08/java$ cat Tempature.java 
import java.util.*;

/* Tempature.java implements class Tempature.
 * Student: Quentin Barnes
 * Date: May 9, 2019
 ************************************************************/

// the Name class appears outside of the rest of the program
class Tempeture {

    private Set<String> farString = new HashSet<String>();
    private Set<String> celString = new HashSet<String>();
    private Set<String> kelString = new HashSet<String>();

    // Name object constructor with initialization
    public Tempeture(final Double degrees, final String scale) {
        farString = new HashSet<String>();
        celString = new HashSet<String>();
        kelString = new HashSet<String>();
        farString.add("f");
        farString.add("F");
        celString.add("c");
        celString.add("C");
        kelString.add("k");
        kelString.add("K");
        if (farString.contains(scale) || celString.contains(scale) || kelString.contains(scale)) {
            myDegrees = degrees;
            myScale = scale;
            if (this.getKelvin() < 0) {
                System.out.print("Unable to create Temp Variable");
                myDegrees = null;
                myScale = null;
            }
        } else {
            System.out.print("Unable to create Temp Variable");
        }
    }

    public Tempeture(final String degScale) {
        farString = new HashSet<String>();
        celString = new HashSet<String>();
        kelString = new HashSet<String>();
        farString.add("f");
        farString.add("F");
        celString.add("c");
        celString.add("C");
        kelString.add("k");
        kelString.add("K");
        String scale = String.valueOf(degScale.charAt(degScale.length() - 1));
        if (farString.contains(scale) || celString.contains(scale) || kelString.contains(scale)) {
            Double degrees = Double.parseDouble(degScale.substring(0, degScale.length() - 2));
            myDegrees = degrees;
            myScale = scale;
            // System.out.print("Temp is: " + myDegrees + " " + myScale);
            if (this.getKelvin() < 0) {
                System.out.print("Unable to create Temp Variable");
                myDegrees = null;
                myScale = null;
            }
        } else {
            System.out.print("Unable to create Temp Variable");
        }
    }

    // Get the degrees of temp
    public final Double getDeg() {
        return myDegrees;
    }

    // Get the scale of temp
    public final String getSacle() {
        return myScale;
    }

    // Get the temp
    public final String getTemp() {
        return Double.toString(myDegrees) + ' ' + myScale;
    }

    // Get Fahrenheit of object no matter the base scale
    public final Double getFahrenheit() {
        if (farString.contains(myScale)) {
            return myDegrees;
        } else if (celString.contains(myScale)) {
            return ((myDegrees * 9 / 5) + 32);
        } else {
            return ((myDegrees - 273.15) * 9 / 5 + 32);
        }
    }

    // Get Celcius of object no matter the base scale
    public final Double getCelcius() {
        if (celString.contains(myScale)) {
            return myDegrees;
        } else if (farString.contains(myScale)) {
            return ((myDegrees - 32) * 5 / 9);
        } else {
            return (myDegrees - 273.15);
        }
    }

    // Get Kelvin of object no matter the base scale
    public final Double getKelvin() {
        if (kelString.contains(myScale)) {
            return myDegrees;
        } else if (celString.contains(myScale)) {
            return (myDegrees + 273.15);
        } else {
            return ((myDegrees - 32) * 5 / 9 + 273.15);
        }
    }

    // Rises temp
    public final Void raise(Double ammount) {
        myDegrees += ammount;
        return null;
    }

    // Lowers temp
    public final Void lower(Double ammount) {
        Double tempDegrees = myDegrees;
        myDegrees -= ammount;
        if (this.getKelvin() < 0) {
            System.out.print("Unable to lower Temp");
            myDegrees = tempDegrees;
        }
        return null;
    }

    // Sees if two temps are equal to eachother
    public final Boolean equals(Tempeture otherTemp) {
        if (this.getFahrenheit() == otherTemp.getFahrenheit()) {
            return true;
        } else {
            return false;
        }
    }

    // Sees if one temp is less than the other
    public final Boolean lessThan(Tempeture otherTemp) {
        if (this.getFahrenheit() < otherTemp.getFahrenheit()) {
            return true;
        } else {
            return false;
        }
    }

    private Double myDegrees;
    private String myScale; // private instance variables
}qmb2@gold34:~/Desktop/GitStuff/CS-214/projects/08/java$ make
javac -deprecation Tempature.java
javac -deprecation TempTester.java
qmb2@gold34:~/Desktop/GitStuff/CS-214/projects/08/java$ java TempTester. 
Enter Degrees for Base Temp: 0
Enter Scale For Base Temp: F
Enter Limit Temp (Degrees and Scale): 100 c
Enter step value: 2.5
0.0 F

2.5 F
5.0 F
7.5 F
10.0 F
12.5 F
15.0 F
17.5 F
20.0 F
22.5 F
25.0 F
27.5 F
30.0 F
32.5 F
35.0 F
37.5 F
40.0 F
42.5 F
45.0 F
47.5 F
50.0 F
52.5 F
55.0 F
57.5 F
60.0 F
62.5 F
65.0 F
67.5 F
70.0 F
72.5 F
75.0 F
77.5 F
80.0 F
82.5 F
85.0 F
87.5 F
90.0 F
92.5 F
95.0 F
97.5 F
100.0 F
102.5 F
105.0 F
107.5 F
110.0 F
112.5 F
115.0 F
117.5 F
120.0 F
122.5 F
125.0 F
127.5 F
130.0 F
132.5 F
135.0 F
137.5 F
140.0 F
142.5 F
145.0 F
147.5 F
150.0 F
152.5 F
155.0 F
157.5 F
160.0 F
162.5 F
165.0 F
167.5 F
170.0 F
172.5 F
175.0 F
177.5 F
180.0 F
182.5 F
185.0 F
187.5 F
190.0 F
192.5 F
195.0 F
197.5 F
200.0 F
202.5 F
205.0 F
207.5 F
210.0 F
212.5 F
qmb2@gold34:~/Desktop/GitStuff/CS-214/projects/08/java$ java TempTester
Enter Degrees for Base Temp: 0k 
Enter Scale For Base Temp: k
Enter Limit Temp (Degrees and Scale): 212 F
Enter step value: 20
0.0 k

20.0 k
40.0 k
60.0 k
80.0 k
100.0 k
120.0 k
140.0 k
160.0 k
180.0 k
200.0 k
220.0 k
240.0 k
260.0 k
280.0 k
300.0 k
320.0 k
340.0 k
360.0 k
380.0 k
qmb2@gold34:~/Desktop/GitStuff/CS-214/projects/08/java$ exit

Script done on Thu 09 May 2019 03:57:38 PM EDT
