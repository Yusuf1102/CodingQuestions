package BasicMath;

import java.util.Scanner;

public class Fibonacci {
    public  static void isFibonacci(int n){
            int num1=0,num2=1;
                for(int i=0;i<n;i++){
                    System.out.println(num1+" ");
                    int num3 = num2 + num1 ;
                    num1 = num2;
                    num2 = num3;
                }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of times to print the number: ");
        int num = sc.nextInt();
        isFibonacci(num);
    }
}
