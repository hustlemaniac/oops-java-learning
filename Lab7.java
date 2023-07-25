// Introduction to abstract classes, abstract methods, and Interface in java
// abstract class cant be instantiated
import java.util.Scanner;
abstract class PersonalInfo{
    String name;
    String ID;
    PersonalInfo(String name, String ID){
        this.name= name;
        this.ID = ID;
    }
    abstract void printInfo();
}
interface Resume{
    void bioData();
}
class Teacher extends PersonalInfo implements Resume{
    String Qualification; 
    double experience;
    String achievements;
    Teacher(String name, String ID, String Qualification, double experience, String achievements){
        super(name, ID);
        this.Qualification = Qualification;
        this.experience = experience;
        this.achievements = achievements;
    }
    void printInfo(){
        System.out.println("The personal information of the teacher is : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);

    }
    public void bioData(){
        System.out.println("****Teacher Resume****");
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);
        System.out.println("Qualification : " + Qualification);
        System.out.println("Experience : " + experience);
        System.out.println("Achievemetns : " + achievements);   

    }
}
class Student extends PersonalInfo implements Resume{
    String result;
    String discipline;
    Student(String name, String ID, String result, String discipline){
        super(name, ID);
        this.result = result;
        this.discipline = discipline;

    }
    void printInfo(){
        System.out.println("The personal information of the student is : ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);

    }
    public void bioData(){
        System.out.println("****Student Resume****");
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);
        System.out.println("Result : " + result);
        System.out.println("Discipline : " + discipline); 

    }
}

public class Lab7 {
    public static void main(String[] args) {
        System.out.println("Enter details of Teacher");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("ID : ");
        String ID = sc.nextLine();
        System.out.print("Qualification : ");
        String Qualification = sc.nextLine();
        System.out.print("experience : ");
        double experience = sc.nextDouble();
        sc.nextLine();
        System.out.print("achievements : ");
        String achievements = sc.nextLine();

        Teacher t = new Teacher(name, ID, Qualification, experience, achievements);
        t.printInfo();
        t.bioData();

        System.out.println("Enter details of Student");
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("ID : ");
        ID = sc.nextLine();
        System.out.print("Result : ");
        String result = sc.nextLine(); 
        System.out.print("Discipline : ");
        String discipline = sc.nextLine(); 
        Student st = new Student(name, ID, result, discipline);
        st.printInfo();
        st.bioData();        

    }
    
}
