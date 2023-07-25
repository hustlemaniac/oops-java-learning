// to print all real solutions of x when a, b and c are taken as input in a qudratic equation
// ex: 4x^2 + 26x + 12 = 0
import java.util.Scanner;
import java.lang.Math;
public class Lab1 {
    // defining the main method
    public static void main(String[] args) {
        // getting values of a, b and c from user
        // using scanner class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        System.out.println("Enter c: ");
        int c = in.nextInt();  
        System.out.println("The possible real time solutions of x are");
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double s1 = ((-b) + Math.sqrt(discriminant)) / (2 * a); 
        double s2 = ((-b) - Math.sqrt(discriminant)) / (2 * a); 
        System.out.println(s1);
        System.out.println(s2);



        
    }
}
