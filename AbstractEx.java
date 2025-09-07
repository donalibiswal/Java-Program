abstract class A {
    void show(){
        System.out.println("class A");
    }
    void display() {
        System.out.println("hello");
    }
}
 class B extends A {
    public void display(){
        System.out.println("hyyy");
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
