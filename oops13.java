public class oops13 {
    public static void main(String[] args) {
        // super keyword
        Horse h=new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        //super();
        super.color="red";
        System.out.println("horse constructor is called");
    }
}