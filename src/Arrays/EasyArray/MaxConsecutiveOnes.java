package Arrays.EasyArray;

public class MaxConsecutiveOnes {

            public int findConsecutiveOnes(int nums[]){
                    int maxi = 0;
                    int count = 0;
                        for(int i = 0; i<nums.length;i++){
                                if(nums[i] == 1){
                                        count++;
                                        maxi= Math.max(maxi,count);
                                }else{
                                    count=0;
                                }
                        }
                        return maxi;
            }
            public static void main(String[] args) {
                MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
                        int nums[] = {1,1,0,1,1,1};
                        int result = obj.findConsecutiveOnes(nums);
                System.out.println("Occurence of 1s in Array:" +result);

            }

}
