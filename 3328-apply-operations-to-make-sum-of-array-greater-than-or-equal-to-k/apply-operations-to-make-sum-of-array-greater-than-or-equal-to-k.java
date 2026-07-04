class Solution {
    public int minOperations(int k) {
        int root=(int)Math.sqrt(k);
        return root+(k-1)/root-1;
    }
}