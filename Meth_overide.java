class Vehicle {
    void move(){
        System.out.println("Vehicle can move");
    }
}
class Car extends Vehicle {
    void move(){
        System.out.println("Car move on 4 wheels");
    }
}
class Bike extends Vehicle {
    void move(){
        System.out.println("Bike move on 2 wheels");
    }
}
public class Meth_overide {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();
        v1.move();
        v2.move();
        v3.move();
    }
}





