class Solution {
    public int alternateDigitSum(int n) {
     int len = (int) Math.log10(n) + 1; 
     int result[]=new int[len];
     for(int i=len-1;i>=0;i--){
        result[i]=n%10;
        n/=10;
     }
     int sum=0;
     int sign=1;
     for(int i=0;i<len;i++){
        sum+=sign*result[i];
        sign*=-1;
     }
     return sum;
    }
}