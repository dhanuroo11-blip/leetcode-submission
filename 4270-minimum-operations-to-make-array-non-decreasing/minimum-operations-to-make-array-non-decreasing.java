class Solution {
    public long minOperations(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                long diff=nums[i]-nums[i+1];
                ans+=diff;
            }
        }
        return ans;
    }
}