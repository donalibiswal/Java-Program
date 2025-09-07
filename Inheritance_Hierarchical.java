class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Circle T1 = new Circle();
        T1.area(6);
    }
}







