class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<(1<<n);i++){
            int xorval=0;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    xorval=xorval^nums[j];
                }
            }
            total=total+xorval;
        }
        return total;
    }
}