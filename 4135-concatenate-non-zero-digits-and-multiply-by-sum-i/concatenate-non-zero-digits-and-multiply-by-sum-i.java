class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int i=1;
        int sum=0;
        while(n>0){
            int m=n%10;
            n/=10;
            if(m==0){
                continue;
            }
            x+=m*i;
            sum+=m;
            i*=10;
        }
        return (long)x*sum;
    }
}