package src;
class Bird {
    void fly() {
        System.out.println("Birds can fly.");
    }
}

class Penguin extends Bird {
    void fly() {
        System.out.println("Penguins cannot fly.");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Bird myBird = new Penguin();
        myBird.fly();
    }
}
