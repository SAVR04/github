class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] dp = new boolean[n][1024];
        dp[0][grid[0][0]] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                boolean[] next = new boolean[1024];
                if (i > 0) {
                    for (int k = 0; k < 1024; k++) {
                        if (dp[j][k]) next[k ^ grid[i][j]] = true;
                    }
                }
                if (j > 0) {
                    for (int k = 0; k < 1024; k++) {
                        if (dp[j - 1][k]) next[k ^ grid[i][j]] = true;
                    }
                }
                dp[j] = next;
            }
        }
        for (int k = 0; k < 1024; k++) {
            if (dp[n - 1][k]) return k;
        }
        return -1;

    }
}