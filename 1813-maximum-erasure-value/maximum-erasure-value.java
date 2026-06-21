class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int sum=0;
       int current=0;
       int start=0;
       Set<Integer> s=new HashSet<>();
       for(int end=0;end<nums.length;end++){
        while(s.contains(nums[end])){
            s.remove(nums[start]);
            current-=nums[start];
            start++;
        }
        current+=nums[end];
        s.add(nums[end]);
        sum=Math.max(sum,current);
       }
       return sum;
    }
}