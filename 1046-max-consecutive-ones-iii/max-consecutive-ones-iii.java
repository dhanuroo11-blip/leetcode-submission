class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int count=0;
        int maxlen=0;
        while(right<nums.length){
            if(nums[right]==0){
                count++;
            }
            right++;
            while(count>k){
               if(nums[left]==0){
                count--;
               }
                left++;
            }
        maxlen=Math.max(maxlen,right-left);
        }
        return maxlen;
    }
}