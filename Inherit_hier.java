class Name{
    public void fullname(){
        System.out.println("donali biswal");
    }
}
class FirstName extends Name{
    public void fullname(){
        System.out.println("donali");
    }
}
class LastName extends Name{
    public void fullname(){
        System.out.println("biswal");
    }
}
public class Inherit_hier {
    public static void main(String[] args) {
        Name T1 = new LastName();
        T1.fullname();
    }
}
