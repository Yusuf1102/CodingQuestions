package Arrays.EasyArray;

public class CheckSortedArray {
    public static Boolean isSortedArray(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }
        return true ;
    }

    public static void main(String[] args) {
        int arr[] = new int [] {1,2,7,4,5};
        if( isSortedArray(arr)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
