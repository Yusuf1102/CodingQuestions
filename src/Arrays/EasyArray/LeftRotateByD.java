package Arrays.EasyArray;

import java.util.Scanner;

public class LeftRotateByD {
    public static void isLeftRotate(int arr[],int n, int d){
        d = d%n;
        int temp[] = new int [d];
        //Taking out elements from original array to temporary array
        for(int i = 0;i<d;i++){
            temp[i] =arr[i];
        }
        for(int i = d ;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Read Size
        System.out.println("Enter the size of Array : ");
        int n =sc.nextInt();

        int arr[] = new int[n];

        //Read Elements
        System.out.println("Enter th array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Read rotation count
        System.out.println("Enter the number of positions to rotate left :");
        int d = sc.nextInt();

        //Left Rotate Function Call
        isLeftRotate(arr,n,d);

        //Print rotated array
        System.out.println("Array after left Rotation ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }

    }
}
