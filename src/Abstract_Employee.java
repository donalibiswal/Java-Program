package src;
abstract class Employe {
    abstract double calculateSalary();
    abstract void displayDetails();
}

class Developer extends Employe {
    @Override
    double calculateSalary() {
        return 50000;
    }
    void displayDetails(){
        System.out.println("name: dona , age:21");
    }
}

class Manager extends Employe {
    @Override
    double calculateSalary() {
        return 70000;
    }
    void displayDetails(){
        System.out.println("name: donali, age:22");
    }

}

public class Abstract_Employee {
    public static void main(String[] args) {
        Employe dev = new Developer();
        System.out.println("Developer Salary: " + dev.calculateSalary());
        dev.displayDetails();

        Employe empp = new Manager();
        System.out.println(empp.calculateSalary());
        empp.displayDetails();


    }
}
