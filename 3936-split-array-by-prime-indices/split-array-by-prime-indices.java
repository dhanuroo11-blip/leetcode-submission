class Solution {
   
        private static boolean[] s(int limit){
            boolean arr[]=new boolean[limit+1];
            Arrays.fill(arr,true);
            arr[0]=false;
            arr[1]=false;
            for(int i=2;i*i<limit;i++){
                 if(arr[i]){
                    for(int j=i*i;j<limit;j+=i){
                        arr[j]=false;
                    }
                 }
            }
            return arr;
        }
         public long splitArray(int[] nums) {
        int max=0;
        long suma=0;
        long sumb=0;
        
        boolean prime[]=s(nums.length);
        for(int i=0;i<nums.length;i++){
            if(prime[i]){
                suma+=nums[i];
            }else sumb+=nums[i];
        }
         return Math.abs(sumb-suma);
    }
}
    
         