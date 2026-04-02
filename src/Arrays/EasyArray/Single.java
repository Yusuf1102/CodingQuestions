package Arrays.EasyArray;

public class Single {
    public static int findSingle(int nums[]){
            int result = 0 ;
                for(int num : nums){
                    result = result ^ num;
                }
                return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4};
        System.out.println("Number is : " +findSingle(nums));
    }
}
