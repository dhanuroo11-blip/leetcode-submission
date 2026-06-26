class Solution {
    public int singleNonDuplicate(int[] nums) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      List <Integer> list = new ArrayList<>(map.keySet());
      for(int i=0;i<list.size();i++){
        int curr=list.get(i);
        if(map.get(curr)==1){
            return curr;
        }
      }
return -1;
    }
}