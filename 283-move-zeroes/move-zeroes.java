class Solution {
    public static void moveZeroes(int[] nums) {
        int j=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
         //   nums[i]=nums[nums.length-1];
          int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
           j++;
        }
       }
       //return nums; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(nums);
    }
}