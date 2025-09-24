class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int minindex=0;
            for(int j=1;j<nums.length;j++){
                if(nums[j]<nums[minindex]){
                    minindex=j;
                }
            }
            nums[minindex]=nums[minindex]*multiplier;

        }
        return nums;
    }
}