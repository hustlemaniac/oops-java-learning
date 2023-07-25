// to demo the method overloading
public class Lab5A {
    
    // integer sum with 2 parameters
    public void sum(int x, int y){
        System.out.println("The integer sum of 2 integers: " + (x + y));

    }
    // integer sum with 3 parameters
    void sum(int a, int b, int c){
        System.out.println("The integer sum of 3 integers: " + (a + b + c));

    }
    // double sum with 2 parameters
    void sum(double m, double n){
        System.out.println("The double sum of 2 floating point literals: " + (m + n));

    }
    public static void main(String[] args) {
        Lab5A l5a = new Lab5A();
        l5a.sum(7, 8);
        l5a.sum(6, -56, 8);
        l5a.sum(4566.5, 5687.67);        
    }
}
