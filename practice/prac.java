class Print1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Donali");
                Thread.sleep(2000);
            }
        }catch (InterruptedException i) {
            System.out.println(i);
        }
    }
}
class Print2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("biswal");
                Thread.sleep(3000);
            }
        } catch (InterruptedException i) {
            System.out.println(i);
        }
    }
}
public class prac {
    public static void main(String[] args) {
        Print1 m1 = new Print1();
        m1.start();

        Print2 m2 = new Print2();
        m2.start();
    }
}
