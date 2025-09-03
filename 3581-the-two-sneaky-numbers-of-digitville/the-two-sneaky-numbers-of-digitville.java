class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer>resultList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(!resultList.contains(nums[i])){
                        resultList.add(nums[i]);
                          }
                          break;
                }
            }
        }
        int result[]=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            result[i]=resultList.get(i);
        }
        return result;
    }
}