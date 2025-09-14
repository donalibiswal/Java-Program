package src;
class Print extends Thread{
    public void run(){
        for(int i = 1; i <=50; i++){
            System.out.println(i);
        }
    }
}
class Print2 extends Thread{
    public void run(){
        for(int i = 100; i <= 155; i++){
            System.out.println(i);
        }
    }
}
public class Multi_threading_Ex{
    public static void main(String[] args) {
        Print m1 = new Print();
        m1.start();

        Print2 m2 = new Print2();
        m2.start();
    }
}
