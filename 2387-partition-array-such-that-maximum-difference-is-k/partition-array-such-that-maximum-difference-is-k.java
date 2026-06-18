class Solution {
    public int partitionArray(int[] nums, int k) {
        int count=1;
        int left=0;
        int right=1;
        Arrays.sort(nums);
        while(right<nums.length){
            int diff=nums[right]-nums[left];
            if(diff<=k) right++;
            else{
                left=right;
                right++;
                count++;
            }
        }
        return count;
    }
}