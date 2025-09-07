class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("im writing");
    }
    public void printcolor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class ClassObjectEx{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "gel";

        pen1.printcolor();
        pen2.printcolor();

    }

}