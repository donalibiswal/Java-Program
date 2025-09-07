class Parent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Calling parent method
        System.out.println("This is the child class.");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
