class Solution {
    public int countDistinctIntegers(int[] nums) {
     Set<Integer> set=new HashSet<>();
     for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
     }
     for(int i=0;i<nums.length;i++){
        if(nums[i]<=9) set.add(nums[i]);
        int temp=nums[i];
        int rev=0;
        int j=1;
        while(temp>0){
            int dig=temp%10;
            rev=(rev*10)+dig;
           
            temp/=10;
        }
        set.add(rev);
        
     }
       return set.size();
    }
}