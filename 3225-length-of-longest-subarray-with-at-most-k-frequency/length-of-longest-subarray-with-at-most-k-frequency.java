class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int left=0;
        //int right=0;
        for(int right=0;right<nums.length;right++){
            int current=0;
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            current=right-left+1;
            max=Math.max(current,max);
        }
        return max;
    }
}