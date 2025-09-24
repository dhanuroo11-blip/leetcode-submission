class Solution {
    public int xorOperation(int n, int start) {
       int nums[]=new int[n];
       for(int i=0;i<n;i++){
        nums[i]=start+2*i;
       } 
      // int total=0;
       int xorval=0;
       for(int i=0;i<n;i++){
        xorval=xorval^nums[i];
       }
       return xorval;
    }
}