package src;
class Bow {
    void tie() {
        System.out.println("A simple bow is tied");
    }
}

class FancyBow extends Bow {
    void tie() {
        System.out.println("A fancy bow with glitter is tied!");
    }
}

public class Polymorphism_ex {
    public static void main(String[] args) {
        Bow myBow = new FancyBow();
        myBow.tie();
    }
}
