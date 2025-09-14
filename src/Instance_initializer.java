package src;
class Test {
    { 
        System.out.println("Instance block"); 
    }
    Test() { 
        System.out.println("Constructor");
    }
}

public class Instance_initializer {
    public static void main(String[] args) {
        new Test();
    }
}