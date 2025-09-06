class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
       // while(i)
        for(int i=0;i<nums.length;i++){
            boolean isunique=true;
            for(int j=0;j<nums.length;j++){
                if(i!=j&&nums[i]==nums[j]){
                 isunique=false;
                 break;
                }
            }
            if(isunique){
                sum+=nums[i];
            }
        }
        return sum;
    }
}