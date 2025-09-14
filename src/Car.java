package src;

    class Car {
        // Constructor
        Car(String brand, String model) {
            System.out.println("Car Brand: " + brand + ", Model: " + model);
        }
    
        // Method
        public void start() {
            System.out.println("The car is starting...");
        }
    
        // Main method
        public static void main(String[] args) {
            // Creating objects
            Car car1 = new Car("Toyota", "Corolla");
            Car car2 = new Car("Honda", "Civic");
    
            // Calling method using an object
            car1.start();
        }
    }

