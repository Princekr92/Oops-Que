public class oops1{
    public static void main(String[] args) {
      Pen p1=new Pen();
        p1.setColor("Black");
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);

      Student s1=new Student();
        s1.setName("prince");
        System.out.println(s1.name);
        s1.setAge(22);
        System.out.println(s1.age);
        s1.setPercentage(75);
        System.out.println(s1.percentage);

      BankAccount b1=new BankAccount();
        b1.setPassword("123prince");
        
    }
}
      class Pen{
      String color;
      int tip;

        void setColor(String newColor){
         color=newColor;
        }

        void setTip(int newTip){
            tip=newTip;
        }
    }

    class Student{
        String name;
        int age;
        float percentage;

        void setName(String newName){
            name=newName;
        }
        void setAge(int newAge){
            age=newAge;
        }
        void setPercentage(float newPercentage){
            percentage=newPercentage;
        }
    }

    class BankAccount{
        private String username;
        private String password;
        public void setPassword(String pwd){
            password=pwd;
        }
    }
    
