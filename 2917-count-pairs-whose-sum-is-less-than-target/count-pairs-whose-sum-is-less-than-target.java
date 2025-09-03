class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            int x=nums.get(i);
            for(int j=i+1;j<nums.size();j++){
                int y=nums.get(j);
                if((x+y)<target){
                    count++;
                }
            }
        }
        return count;
    }
}