package src;
import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Neagtive");
        }else{
            System.out.println("positive");
        }
    }
}
