class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxfreq=0;
        int total=0;
       for(int i=0;i<nums.length;i++){
        boolean seen = false;
            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    seen = true;
                    break;
                }
            }
            if (seen) continue; 
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
        if(count>maxfreq){
            maxfreq=count;
            total=count;
        }
        else if(count==maxfreq){
            total+=count;
        }
       } 
       return total;
    }
}