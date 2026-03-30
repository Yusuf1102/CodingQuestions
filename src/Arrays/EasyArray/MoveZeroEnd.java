package Arrays.EasyArray;


public class MoveZeroEnd {
    public static void move_zero(int arr[], int n) {

        //Step 1
        int temp[] = new int[n];
        int nt = 0;

        //Step 2
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[nt] = arr[i];
                nt++;
            }//end of if
        }//end of loop

        //Step 3
        for (int i = nt; i < n; i++) {
            temp[i] = 0;
        }//end of loop

        //Step 4
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

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
