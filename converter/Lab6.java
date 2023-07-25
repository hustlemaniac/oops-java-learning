// Develop a java application to implement currency converter 
// (Dollar to INR, EURO to INR, Yen to INR and vice versa), 
// distance converter (meter to KM, miles to KM and vice versa), 
// time converter (hours to minutes, seconds and vice versa) using packages.


package converter;

public class Lab6 {
    public static void main(String[] args) {
        currency c = new currency();
        System.out.println( c.Yen_Inr(8));
        distance d = new distance();
        System.out.println( d.miles_kilometer(57));
        time t = new time();
        System.out.println( t.sec_hour(6780));
    }
        
}

// to execute
// first compile currency.java using javac converter/currency.java
// next compile Lab6.java using javac converter/Lab6.java
// now run Lab6 using java converter.Lab6

    
