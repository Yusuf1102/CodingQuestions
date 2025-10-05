package Arrays.EasyArray;

public class SecondLargest {
    public static void isSecondLargest(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        int secondLargest=-1;
        for (int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest :"+largest);
        System.out.println("Second Largest : " +secondLargest);

    }
    public static void main(String[] args) {

        int arr[]=new int[]{1,23,232,12,9};
        isSecondLargest(arr);

    }
}
