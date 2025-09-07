import java.util.Scanner;

public class FuncCircleCircum {
    public static Double CircleCircumference(Double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(CircleCircumference(r));
    }
}
