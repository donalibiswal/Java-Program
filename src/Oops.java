package src;
class Shape{
    String color;
}
class Triangle extends Shape{

}
public class Oops {
    public static void main(String[] args){
      Triangle t1 = new Triangle();
      t1.color = "red";
    }
}
