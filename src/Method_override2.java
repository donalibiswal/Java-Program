package src;
class Shoes{
    int price(){
        return 6000;
    }
    int size(){
        return 5;
    }
}
class Nike extends Shoes{
    int price(){
        return 5000;
    }
    int size(){
        return 6;
    }
}
public class Method_override2 {
    public static void main(String[] args) {
        Shoes s1 = new Nike();
        System.out.println(s1.price());
        System.out.println(s1.size());

        Shoes s2 = new Shoes();
        System.out.println(s2.price());
        System.out.println(s2.size());
    }
}
