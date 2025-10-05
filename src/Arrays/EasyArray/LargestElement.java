package Arrays.EasyArray;

public class LargestElement {
    public static void isLargestElement(int arr[]){
        int n = arr.length;
        int larget = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>larget){
                larget =arr[i];
            }
        }
        System.out.println("larget number : "+larget);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,4123,292};
        int n = arr.length;
        isLargestElement(arr);

    }
}
