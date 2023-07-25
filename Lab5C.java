// to demonstrate method overriding, done when subclass gives
// its own definition to the method in super class
class Animal{
    void sound(){
        System.out.println("The animal makes sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks");
    }
}
public class Lab5C {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

    }
    
}
