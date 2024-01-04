public class oops11 {
    // Runtime polymorphism-->Parent and child both same function with a different definition
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat mango");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}