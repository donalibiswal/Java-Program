class Person {
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
    // Getter method
    public String getName() {
        return name;
    }
}

public class Encapsulation_Ex {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("don");
        System.out.println("Name: " + p.getName());
    }
}

