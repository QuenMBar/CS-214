import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.org.apache.xpath.internal.operations.Equals;

/* Name.java implements class Name.
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Student: Quentin Barnes
 * Date: April 13, 2019
 ************************************************************/

// the Name class appears outside of the rest of the program
class Tempeture {

    // Name object constructor with initialization
    public Tempeture(final Double degrees, final String scale) {
        if (scale == ('F' | 'f' | 'C' | 'c' | 'K' | 'k')) {
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
        String scale = degScale.charAt(degScale.length() - 1);
        if (scale == ('F' | 'f' | 'C' | 'c' | 'K' | 'k')) {
            Double degrees = Double.parseDouble(degScale.substring(0, degScale.length() - 2));
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

    public final Double getDeg() {
        return myScale;
    }

    public final String getSacle() {
        return myScale;
    }

    public final String getTemp() {
        return Double.toString(myDegrees) + ' ' + myScale;
    }

    public final Double getFahrenheit() {
        if (myScale == ('F' | 'f')) {
            return myDegrees;
        } else if (myScale == ('C' | 'c')) {
            return ((myDegrees * (9 / 5)) + 32);
        } else {
            return ((myDegrees - 273.15) * (9 / 5) + 32);
        }
    }

    public final Double getCelcius() {
        if (myScale == ('C' | 'c')) {
            return myDegrees;
        } else if (myScale == ('F' | 'F')) {
            return ((myDegrees - 32) * (5 / 9));
        } else {
            return (myDegrees - 273.15);
        }
    }

    public final Double getKelvin() {
        if (myScale == ('K' | 'k')) {
            return myDegrees;
        } else if (myScale == ('C' | 'c')) {
            return (myDegrees + 273.15);
        } else {
            return ((myDegrees - 32) * (5 / 9) + 273.15);
        }
    }

    public final Void raise(Double ammount) {
        myDegrees += ammount;
        return null;
    }

    public final Void lower(Double ammount) {
        Double tempDegrees = myDegrees;
        myDegrees -= ammount;
        if (this.getKelvin() < 0) {
            System.out.print("Unable to lower Temp");
            myDegrees = tempDegrees;
        }
        return null;
    }

    public final Boolean equals(Tempeture otherTemp) {
        if (this.getKelvin() == otherTemp.getKelvin()) {
            return true;
        } else {
            return false;
        }
    }

    public final Boolean lessThan(Tempeture otherTemp) {
        if (this.getKelvin() < otherTemp.getKelvin()) {
            return true;
        } else {
            return false;
        }
    }

    private Double myDegrees;
    private String myScale; // private instance variables
}