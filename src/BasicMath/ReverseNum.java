package BasicMath;

import java.util.Scanner;

public class ReverseNum {
    public static  int isReverseNum(int num){
        int temp = num;
        int result = 0;
        while (temp!=0){
            int rem = temp % 10;
            result = result*10+rem;
            temp =temp/10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        System.out.println("Reversed num :"+isReverseNum(num));
    }
}
