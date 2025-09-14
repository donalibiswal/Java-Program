package src;
class Mouse{
    void leftClick(){
        System.out.println("we can do left click");
    }
    void rightClick(int x , int y){
        System.out.println("we can do right click");
    }
}
class Phones extends Mouse{
    int price;
    int storage;
    String model;

    void show(String model){
        System.out.println("Model:" + model);
    }
    void getPhone(int storage, int price){
        System.out.println("storage:" + storage + ", price:" + price);
    }
}

class Samsung_s24_ultra extends Phones{
    int price;
    int storage;

    void quality(String quality){
        System.out.println("have a good quality");
    }
    void camera(String size){
        System.out.println("camera size in round");
    }
    void batteryLife(String life){
        System.out.println("battery life: " + life);
    }
}

public class Inheritance_multiEx{
    public static void main(String[] args) {
        Samsung_s24_ultra s2 = new Samsung_s24_ultra();
        s2.show("s24 ultra");
        s2.getPhone(256, 1200);
        s2.quality("excellent");
        s2.camera("108MP");
        s2.batteryLife("24 hours");
        
        Mouse m1 = new Mouse();
        m1.leftClick();
        m1.rightClick(12, 11);

    }
}