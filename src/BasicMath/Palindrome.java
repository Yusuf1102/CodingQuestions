package BasicMath;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int temp=num;
        int result = 0;
        while (temp!=0){
            int rem = temp % 10;
            result = result *10+rem;
            temp = temp /10;
        }
        return  result==num;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the required num : ");
        int num = sc.nextInt();
        if ((isPalindrome(num))){
            System.out.println(num +" : is a Palindrome");
        }else{
            System.out.println(num + " : is not a Palindrome");
        }
    }
}
