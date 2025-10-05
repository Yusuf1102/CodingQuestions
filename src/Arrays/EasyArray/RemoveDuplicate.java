package Arrays.EasyArray;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,2,3,3,4};
        int n = arr.length;
        removeDuplicate(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
    public static int removeDuplicate(int arr[],int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
