class Solution {
    private int[] memo;
    
    public int climbStairs(int n) {
        memo = new int[n + 1];
        return climb(n);
    }
    
    private int climb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = climb(n - 1) + climb(n - 2);
        return memo[n];
    }
}
