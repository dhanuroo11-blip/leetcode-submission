class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(nums));
    }
}