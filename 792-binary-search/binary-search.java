class Solution {
    public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
        
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int [size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(nums,target));
    }
}