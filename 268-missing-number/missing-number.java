class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int result=0;
      // int result[]=new int[nums.length+1];
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
         if(nums[i]!=i){
            return i;
         }
       }
       return n;
    }
}