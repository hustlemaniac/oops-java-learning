/**
 * Lab3A
 */
import java.util.Scanner;
public class Lab3A {

    public static void main(String[] args) {
        System.out.println("To check if prime number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        boolean isPrime = true;
        int n = scanner.nextInt();
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                System.out.println("The given number "+ n + " is not prime");
                break;
            }
        }
        if(isPrime){
            System.out.println("The given number "+ n + " is prime");
        }


    }
}