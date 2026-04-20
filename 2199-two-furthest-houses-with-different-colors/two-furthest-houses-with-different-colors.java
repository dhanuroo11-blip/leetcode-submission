class Solution {
    public int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                int dis=j-i;
                max=Math.max(max,dis);
                }
            }
        }
        return max;
    }

}