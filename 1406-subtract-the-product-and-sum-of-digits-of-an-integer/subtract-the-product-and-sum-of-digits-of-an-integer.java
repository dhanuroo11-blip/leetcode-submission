class Solution {
    public static int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0){
            int dig=n%10;
            product*=dig;
            sum+=dig;
            n/=10;
        }
        return product-sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
}