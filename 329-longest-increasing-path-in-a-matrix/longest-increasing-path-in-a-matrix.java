class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int len = dfs(matrix, dp, i, j, m, n);
                if (len > max) {
                    max = len;
                }
            }
        }
        return max;
    }

    public int dfs(int[][] matrix, int[][] dp, int i, int j, int m, int n) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int max = 1;

        // Move Up
        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            int len = 1 + dfs(matrix, dp, i - 1, j, m, n);
            if (len > max) max = len;
        }

        // Move Down
        if (i < m - 1 && matrix[i + 1][j] > matrix[i][j]) {
            int len = 1 + dfs(matrix, dp, i + 1, j, m, n);
            if (len > max) max = len;
        }

        // Move Left
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            int len = 1 + dfs(matrix, dp, i, j - 1, m, n);
            if (len > max) max = len;
        }

        // Move Right
        if (j < n - 1 && matrix[i][j + 1] > matrix[i][j]) {
            int len = 1 + dfs(matrix, dp, i, j + 1, m, n);
            if (len > max) max = len;
        }

        dp[i][j] = max;
        return max;
    }
}
