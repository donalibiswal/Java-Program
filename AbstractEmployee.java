abstract class Employee{
    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee{
    void calculateSalary(){
        System.out.println("salary calculation of manager");
    }
    void displayDetails(){
        System.out.println("display the details of manager");
    }
}

class Developer extends Employee{
    void calculateSalary(){
        System.out.println("developer salary");
    }
    void displayDetails(){
        System.out.println("developer details");
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {
        Employee emp = new Developer();
        emp.calculateSalary();
        emp.displayDetails();

        Employee emp2 = new Manager();
        emp2.calculateSalary();
        emp2.displayDetails();
    }
}
