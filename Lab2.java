// need to create a class called Student with instance variables
import java.util.Scanner;
class Student{
    // instance variables
    int USN;
    String Name;
    String Branch;
    long Phone;
    // class variable
    static int numberOfStudents = 0;
    // parameterised constructor
    public Student(int USN, String Name, String Branch, long Phone){
        this.USN = USN;
        this.Name = Name;
        this.Branch = Branch;
        this.Phone = Phone;
        numberOfStudents++;
    }
    void displayDetails(){
        System.out.println("USN : " + USN );
        System.out.println("Name : " + Name );
        System.out.println("Branch : " + Branch );
        System.out.println("Phone : " + Phone );

    }
}
public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = in.nextInt();
        in.nextLine();  // Consume newline left-over
        for(int i = 1; i <= n; i++){
            System.out.println("Enter name");
            String Name = in.nextLine();
            System.out.println("Enter USN");
            int USN = in.nextInt();
            System.out.println("Enter Phone number");
            long Phone = in.nextLong();
            System.out.println("Enter branch");
            in.nextLine();  // Consume newline left-over
            String Branch = in.nextLine();
            Student s = new Student(USN, Name, Branch, Phone);
            // accessing instance variables
            s.displayDetails();
            System.out.println();
        }
        // accessing class variable
        System.out.println("The total number of students are : " + Student.numberOfStudents);
    }
        
    }

