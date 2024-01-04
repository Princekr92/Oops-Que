public class oops4 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("prince");
        Student s3=new Student(77);

    }
}
// types of constructor
// non parametrized
// parametrized
// copy constructor
// in this code constructor is overloading
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("my name is rock");
    }

    Student(String name){
       this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }
}
