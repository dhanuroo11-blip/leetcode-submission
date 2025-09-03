class Solution {
    public static int majorityElement(int[] nums) {
        
        int n=nums.length;
       
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<n;j++){
               if(nums[i]==nums[j]){
                    count++;
                }
                }if(count>n/2){
                    return nums[i];
                }
               
            
        }
       return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
}