class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int totalsub=(i+1)*(n-i);
            int oddcount=(totalsub+1)/2;
            totalsum+=arr[i]*oddcount;
        }
        return totalsum;
    }
}