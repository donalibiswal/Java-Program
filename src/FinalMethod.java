package src;
class Parent {
    final void display() { System.out.println("Parent method"); }
}
class Child extends Parent {
    // Cannot override display()
}
public class FinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
