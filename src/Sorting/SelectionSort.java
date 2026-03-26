package Sorting;

public class SelectionSort {

    public static void selection_Sort(int arr[],int n){

            for(int i=0;i<n-1;i++){
                    //Declaring the mininum to assign low value
                    int mini = i ;
                        for(int j=i+1;j<n;j++){
                            if(arr[j] < arr[mini]){
                                    mini = j ;
                            }
                        }
                        int temp = arr[mini];
                        arr[mini] = arr[i];
                        arr[i] = temp ;

            }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{13,46,24,52,20,9};
        int n = arr.length;
        selection_Sort(arr, n);
        for(int nums : arr){
            System.out.println(nums);
        }
    }
}
