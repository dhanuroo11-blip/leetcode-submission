class Solution {
    public int minElement(int[] nums) {
      int num[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        int sum=0;
        int temp=nums[i];
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        num[i]=sum;
      }
      int min=num[0];
      for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
      } 
      return min; 
    }
}