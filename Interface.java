interface Printable{
    public void display(){
        System.out.println("hello");
    }
}
interface Showable{
    public void display(){
        System.out.println("hell");
    }
}

public class Interface {
    public static void main(String[] args) {
        Printable p1 = new Showable();
        p1.display();
    }
}
