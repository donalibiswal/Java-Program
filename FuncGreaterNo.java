import java.util.Scanner;

public class FuncGreaterNo {
    public static void PrintGreater(int a, int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PrintGreater(a,b);
        
    }
}
