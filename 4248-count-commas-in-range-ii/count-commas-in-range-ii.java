class Solution {
    public long countCommas(long n) {
       long commas=0;
       long threshold=1000L;
       while(n>=threshold){
        commas+=(n-threshold)+1;
        
        threshold*=1000L;
       }

       return commas;
    }
}