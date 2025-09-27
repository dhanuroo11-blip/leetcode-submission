class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n+1];
        List<Integer> resultlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                resultlist.add(i);
            }
        }
        return resultlist;
    }
}