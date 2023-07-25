import java.util.Scanner;
class Staff{
    int StaffId;
    String Name;
    long Phone;
    double Salary;
    // this sc object can be used by sub classes as well
    Scanner sc = new Scanner(System.in);
    public Staff(int StaffId, String Name, long Phone, double Salary){
        this.StaffId = StaffId;
        this.Name = Name;
        this.Phone = Phone;
        this.Salary = Salary;
    }
    public void displayDetails(){
        System.out.println();
        System.out.println("************");
        System.out.println("StaffID : " + StaffId);
        System.out.println("Name : " + Name);
        System.out.println("Phone : " + Phone);
        System.out.println("Salary : " + Salary);
    }
}
// this will achieve inheritance
class Teaching extends Staff{
    String domain;
    String publication;
    
    // if super class has an implicit constructor
    // the sub class has to take care of instance variable of parent class as well
    public Teaching(String domain, String publication, int StaffId, String Name, long Phone, double Salary){
        // invoke super class constructor
        super(StaffId, Name, Phone, Salary);
        this.domain = domain;
        this.publication = publication;
    }
    // this will acheive runtime polymorphism
    public void displayDetails(){
        // to override but still execute the displayDetails of the super class
        super.displayDetails();
        System.out.println("Domain : " + domain);
        System.out.println("Publication : " + publication);
    }
}
class Technical extends Staff{
    // don't know the size
    public String[] skills;
    int size;

    // lets see if we can take the input via scanner class inside the constructor
    public Technical(int StaffId, String Name, long Phone, double Salary){
        super(StaffId, Name, Phone, Salary);
        // now we know the size
        System.out.println("Enter number of skills");
        size = sc.nextInt();
        sc.nextLine();
        skills = new String[size];
        System.out.println("Enter the skills");
        for(int i = 0; i < size; i++){
            skills[i] = sc.nextLine();
        }

    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("The skills are");
        for(int i = 0; i < size; i++){
            System.out.print(skills[i] + " ");
        }
        System.out.println();
        
    }
}
class Contract extends Staff{
    float period;
    public Contract(int StaffId, String Name, long Phone, double Salary){
        super(StaffId, Name, Phone, Salary);
        System.out.println("Enter period of contract(in years)");
        period = sc.nextFloat();
        sc.nextLine();       
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Period of contract : " + period);
    }
}
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // obj of super class
        System.out.println("Enter StaffId :");
        int StaffId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name :");
        String Name = sc.nextLine();
        System.out.println("Enter Phone :");
        long Phone = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Salary :");
        double Salary = sc.nextDouble();
        sc.nextLine();
        Staff s = new Staff(StaffId, Name, Phone, Salary);
        s.displayDetails();
        System.out.println("Enter domain : ");
        String domain = sc.nextLine();
        System.out.println("Enter publication : ");
        String publication = sc.nextLine();
        Teaching t = new Teaching(domain, publication, StaffId, Name, Phone, Salary);
        t.displayDetails();
        Technical tn = new Technical(StaffId, Name, Phone, Salary);
        tn.displayDetails();
        Contract c = new Contract(StaffId, Name, Phone, Salary); 
        c.displayDetails();
    }
}
