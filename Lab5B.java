// to demonstrate constructor overloading
class Circle{
    double pi = 3.14;
    double radius;
    //constructor with one paramter and default pi value
    Circle(double radius){
        this.radius = radius;
    }
    // constructor with 2 parameters
    Circle(double radius, double pi){
        this.radius = radius;
        this.pi = pi;
    }
    double calArea(){
        System.out.println(pi);
        return pi * radius * radius;
    }

}
public class Lab5B{
    public static void main(String[] args) {
        Circle c1 = new Circle(3.5);
        System.out.println("The area of circle1 is : " + c1.calArea());
        Circle c2 = new Circle(7, ((double)22 / 7));
        System.out.println("The area of circle2 is : " + c2.calArea());    
    }

}
    

