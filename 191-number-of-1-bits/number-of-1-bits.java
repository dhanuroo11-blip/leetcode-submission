class Solution {
    public int hammingWeight(int n) {
      StringBuilder result=new StringBuilder();
      int count=0;
      while(n>0){
        int remainder=n%2;
         if(remainder==1) count++;
        n=n/2;
      }
     
      return count;
    }
}