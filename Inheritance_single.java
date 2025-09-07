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
public class Inheritance_single {
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        Triangle T2 = new Triangle();
        
        T1.area(20,10);
        T2.area();
    }
}
