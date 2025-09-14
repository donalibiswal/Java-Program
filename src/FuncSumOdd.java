package src;
//write a function to print sum of all odd no from 1 to n.

import java.util.Scanner;

public class FuncSumOdd {
    public static void PrintOdd(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                 sum +=i;
            }
        }
        System.out.println("sum of all odd number from 1 to " + n + " is: " + sum);
        
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = sc.nextInt();
        PrintOdd(n);
        sc.close();
        
    }
}
