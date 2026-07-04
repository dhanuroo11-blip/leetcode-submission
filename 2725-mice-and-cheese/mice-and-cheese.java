class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int sum=0;
        int n=reward1.length;
     int diff[]=new int[reward1.length];
        for(int i=0;i<reward2.length;i++){
            diff[i]=reward1[i]-reward2[i];
            sum+=reward2[i];
        }
       Arrays.sort(diff);
       for(int i=0;i<k;i++){
        sum+=diff[n-1-i];
       }
      return sum;
    }
}