class Student {
    private int id;

    // Constructor
    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class Encapsulation_Constructor {
    public static void main(String[] args) {
        Student s = new Student(101);
        System.out.println("Student ID: " + s.getId());
    }
}
