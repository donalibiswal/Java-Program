package src;
class Print {
    void printData(int a) {
        System.out.println(a);
    }
    void printData(double a) {
        System.out.println(a);
    }
    void printData(String a) {
        System.out.println(a);
    }
}
public class Meth_overload2 {
    public static void main(String[] args){
        Print p1 = new Print();
        p1.printData(5);
        p1.printData(5.5);
        p1.printData("Hello");
    }
}
