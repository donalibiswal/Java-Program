class Calculator {
    int multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product of two integers: " + product);
        return product;
    }

    int multiply(int x, int y, int z) {
        int product = x * y * z;
        System.out.println("Product of three integers: " + product);
        return product;
    }

    double multiply(double x, double y) {
        double product = x * y;
        System.out.println("Product of two doubles: " + product);
        return product;
    }
}

public class Meth_overload {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.multiply(2, 3);
        c1.multiply(4.2, 5.2);
        c1.multiply(5, 6, 7);
    }
}