package Arrays.EasyArray;


public class MoveZeroEnd {
    public static int[] move_zero(int arr[], int n) {

        int j =-1;
            for(int i =0;i<n;i++){
                if(arr[i] == 0){
                    j=i;
                    break;
                }
            }

            if(j==-1) return arr;

            for(int i =j+1;i<n;i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
            return arr;

    }//end of function

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;

        move_zero(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//
//        //Step 1
//        int temp[] = new int[n];
//        int nt = 0;
//
//        //Step 2
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                temp[nt] = arr[i];
//                nt++;
//            }//end of if
//        }//end of loop
//
//        //Step 3
//        for (int i = nt; i < n; i++) {
//            temp[i] = 0;
//        }//end of loop
//
//        //Step 4
//        for (int i = 0; i < n; i++) {
//            arr[i] = temp[i];
//        }