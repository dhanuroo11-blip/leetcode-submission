class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int result[]=new int[size+1];
      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                result[val]++;
            }
        }
        int repeated=-1;
        int missing=-1;
        for(int i=1;i<=size;i++){
            if(result[i]==2){
                repeated=i;
            }
            if(result[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}