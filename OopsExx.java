class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void show(){
        System.out.println("triangle area");
    }
}
class Circle extends Shape{
    public void meth(){
        System.out.println("circle area");
    }
}
public class OopsExx {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.show();
        t1.area();
        Circle c1 = new Circle();
        c1.meth();
        c1.area();
    }
}
