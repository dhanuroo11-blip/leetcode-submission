class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int left=1;
        int right=n-2;
        long sum=0;
        long val=0;
        long ans=0;
        val=skill[left-1]+skill[right+1];
        ans+=skill[left-1]*skill[right+1];
        while(left<right){
            sum=skill[left]+skill[right];
            if(sum==val) {
                ans+=skill[left]*skill[right];
                left++;
                right--;
            }else return -1;
        }
        return ans;
    }
}