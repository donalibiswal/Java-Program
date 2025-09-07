class Animal {
    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Hierarchical_Inherit {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sleep();
        c.meow();

        Dog d = new Dog();
        d.sleep();
        d.bark();
    }
}
