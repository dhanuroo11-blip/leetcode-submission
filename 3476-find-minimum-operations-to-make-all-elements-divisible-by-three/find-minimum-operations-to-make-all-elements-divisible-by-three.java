class Solution {
    public static int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();

        }
        int result=minimumOperations (nums);
        System.out.println(result);
    }
}