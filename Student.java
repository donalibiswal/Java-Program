class Student {
    // Constructor
    Student(String name, int age) {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    // Method
    public void study() {
        System.out.println("The student is studying...");
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student("Rohan", 13);
        Student s2 = new Student("Rani", 23);

        // Calling method using an object
        s1.study();
    }
}
