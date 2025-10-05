package BasicMath;

import java.util.Scanner;

public class DecimalToBinary {
    public static void convertDecimalToBinary(int num){
        int binaryNum []=new int[1000];
        int i=0;
        while (num!=0){
            binaryNum[i] = num%2;
            num= num/2;
            i++;
        }
        for (int j=i-1;j>0;j--){
            System.out.print(binaryNum[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Decimal number : "+num);
        System.out.print("Binary :  ");
        convertDecimalToBinary(num);
    }
}
