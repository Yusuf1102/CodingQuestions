package Arrays.EasyArray;

public class MissingNumber {

    public static int findMissing(int arr[], int n) {

        for (int i = 1; i <= n; i++) {
            int flag = 0;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                return i;
            }
        }

        return -1; // if no missing number
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int n = 5;

        System.out.println(findMissing(arr, n));
    }
}