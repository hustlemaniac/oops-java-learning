import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose the arithematic operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int option = sc.nextInt();
            System.out.println("Enter a and b");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("The addition is " + (a + b));
                    break;
                case 2:
                    System.out.println("The subtraction is " + (a - b));
                    break;
                case 3:
                    System.out.println("The multiplication is " + (a * b));
                    break;
                case 4:
                    if(b != 0){
                        System.out.println("The division is " + (a / b));
                    }
                    else{
                        System.out.println("Division by 0 is not possible");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
