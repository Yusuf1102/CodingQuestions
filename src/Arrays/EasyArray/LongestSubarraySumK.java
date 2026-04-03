package Arrays.EasyArray;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                for (int x = i; x <= j; x++) {
                    sum += arr[x];
                }// end of loop

                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }//end of if
            }//end of inner loop
        }// end of outer loop
        return maxLen;
    }//end of function

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        System.out.println(longestSubarray(arr, k));
    }
}
