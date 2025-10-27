class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinct=1;
        int last=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(last!=nums[i]){
                distinct++;
                last=nums[i];
            }
            if(distinct==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}