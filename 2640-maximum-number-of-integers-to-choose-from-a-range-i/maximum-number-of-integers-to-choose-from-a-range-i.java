class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int b=banned.length;
        int arr[]=new int[10001];
        for(int i=0;i<b;i++){
            arr[banned[i]]=1;
        }
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(arr[i]==1) continue;
            sum+=i;
            if(sum<=maxSum) count++;
        }
        return count;
    }
}