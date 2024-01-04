public class oops10 {
    // polymorphism
    // 1.Compile time polymorphism-->method overloading
    //method overloading--> multiple function with the same name but different parameter

    // 2.Runtime time polymorphism-->method overriding

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,3));
        System.out.println(calc.sum((float)2.4,(float)4.6));
        System.out.println(calc.sum(1,2,3));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
