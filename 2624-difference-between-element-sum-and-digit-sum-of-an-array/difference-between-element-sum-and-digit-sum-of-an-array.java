class Solution {
    public static int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
           }
           for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            while(temp>0){
                sum2+=temp%10;
                temp/=10;
            }
           }
        return sum1-sum2;
    }public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(differenceOfSum(nums));
    }
}