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
}