public class oops2 {
    public static void main(String[] args) {
        // setter and getter method
        Pen p1=new Pen();
          p1.setColor("Black");
          System.out.println(p1.getColor());
          p1.setTip(4);
          System.out.println(p1.getTip());
}
}
     
 class Pen{
      private String color;
      private int tip;

      String getColor(){
        return this.color;
      }

      int getTip(){
        return this.tip;
      }
        void setColor(String newColor){
         this.color=newColor;
        }

        void setTip(int newTip){
            tip=newTip;
        }
    }

