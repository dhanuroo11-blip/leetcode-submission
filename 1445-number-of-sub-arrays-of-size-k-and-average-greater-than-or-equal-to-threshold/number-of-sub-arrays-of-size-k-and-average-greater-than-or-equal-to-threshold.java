class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        double avg=0;
       // int maxavg=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
           }
         avg=(double)sum/k;
           if(avg>=threshold) count++;
       // maxavg=avg;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            avg=(double)sum/k;
            if(avg>=threshold) count++;
           }
         
        return count;
    }
}