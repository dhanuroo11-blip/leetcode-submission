class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum=0;
        int temp=n;
        while(temp!=0){
            int dig=temp%10;
            int pro=1;
            for(int i=1;i<=dig;i++){
                // pro=1;
                  pro*=i;
            }
            sum+=pro;
            temp/=10;
        }
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        int t1=n;
        while(t1!=0){
            int dig=t1%10;
            arr1[dig]++;
            t1/=10;
        }
        while(sum!=0){
            int dig=sum%10;
            arr2[dig]++;
            sum/=10;
        }
        return Arrays.equals(arr1,arr2);
    }
}