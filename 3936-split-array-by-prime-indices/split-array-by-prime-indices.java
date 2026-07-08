class Solution {
    public long splitArray(int[] nums) {
        long suma=0;
        long sumb=0;
        
        for(int i=0;i<nums.length;i++){
boolean found=true;
if(i<=1){
    found=false;
}else{
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    found=false;
                    break;
                }
               // else found=false;
            }
}
            if(found) suma+=nums[i];
            else sumb+=nums[i];
        }
        return Math.abs(suma-sumb);
    }
}