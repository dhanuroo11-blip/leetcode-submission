class Solution {
    public int minCost(int n) {
        int temp=n;
        int a,b;
        int pro=0;
        
        int mincost=Integer.MAX_VALUE;
       while(temp>1){
        a=1;
        b=temp-a;
        pro+=a*b;
        temp=b;
       }
        //return temp*(temp-1)/2;
        return pro;
    }
}