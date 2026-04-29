class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int arr[]=new int[n]; 
        int sum=0; 
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            sum+=matrix[i][j];
            }
            arr[k]=sum;
            k++;
            sum=0;
        }
        return arr;
    }
}