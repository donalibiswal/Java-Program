package src;

class Carr{
    public void wheel(){
        System.out.println("i hava 4 wheel");
    }
}
class Kia extends Carr{
    public void show(){
        System.out.println("i hava also 4 wheel");
    }
}
class Bmw extends Carr{
    public void meth(){
        System.out.println(" yes i hava 4 wheel");
    }
}

public class Inherit{
    public static void main(String[] args) {
        Kia k1 = new Kia();
        k1.show();
        k1.wheel();

        Bmw b1 = new Bmw();
        b1.meth();
        b1.wheel();
    }
}
