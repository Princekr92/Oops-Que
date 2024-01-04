public class oops8 {
    // 3.hierarchical inheritance
    public static void main(String[] args) {
        Bird m1=new Bird();
         m1.walk();
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Derived class subclass

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Mammal{
    void fly(){
        System.out.println("fly");
    }
}
