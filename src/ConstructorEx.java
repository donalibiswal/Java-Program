package src;

public class ConstructorEx {
    public String name;

    public ConstructorEx() {
        System.out.println("im donali");
        name = "donali";
    }
    public static void main(String[] args) {
        ConstructorEx  obj = new ConstructorEx();
        System.out.println("the name is:" +obj.name);
    }
}
