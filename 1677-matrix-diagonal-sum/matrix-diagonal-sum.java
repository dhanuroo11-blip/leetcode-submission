class Solution {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        //int sum2=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
              sum+=mat[i][i];
              sum+=mat[n-1-i][i];
        }
        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int mat[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }
}