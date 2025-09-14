package src;
public class Polymorphism{
    public static void main(String[] args) {
        Polymorphism m1 = new Polymorphism();
        m1.add();
        m1.add(18,14);

    }
    void add (){
        int a = 5;
        int b = 6;
        int c;
        c = a+b;
        System.out.println(c);
    }
    void add (int x, int y){
        float z = x + y;
        System.out.println(z);
    }
}     

