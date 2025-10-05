package Arrays.EasyArray;

public class LeftRotateByOne {
    public static void isleftRotateByOne(int arr[],int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

    }

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        int n = arr.length;
        isleftRotateByOne(arr,n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
