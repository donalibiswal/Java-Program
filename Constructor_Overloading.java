class Employee {
    String name;
    int age;

    // Constructor Overloading
    Employee() {
        this.name = "Unknown";
        this.age = 0;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice", 30);
        e1.display();
        e2.display();
    }
}
