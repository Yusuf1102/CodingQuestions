package TwoPointers.Better;

import java.util.HashMap;


public class TwoSumHashMap {
        public static int[] twoSumHashMap(int nums[],int target){
            HashMap<Integer,Integer> map = new HashMap<>();
                for (int i=0;i<nums.length;i++){
                        int complement = target-nums[i];
                        if(map.containsKey(complement)){
                            return new int[]{map.get(complement),i};
                        }//end of if

                        map.put(nums[i],i);
                }//end of loop
            return new int []{-1,-1};

        }//end of function

    public static void main(String[] args) {
        int[] nums = {15, 7, 11, 2};
        int target = 9;
        int[] result = twoSumHashMap(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}//end of class
