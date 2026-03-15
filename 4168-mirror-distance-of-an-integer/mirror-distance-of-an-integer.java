class Solution {
    public int mirrorDistance(int n) {
        int reverse = 0;
        int n1 = n;
        
        // Loop to reverse the digits of n
        while(n > 0) {
            int dig = n % 10;
            reverse = reverse * 10 + dig;
            n = n / 10;
        }
        
       
        return Math.abs(n1 - reverse);
    }
}
