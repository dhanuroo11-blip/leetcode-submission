class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int s=0;
        for(int i=0;i<derived.length;i++){
            s^=derived[i];
        }
        return s==0;
    }
}