class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Step 1: Make first column all 1s
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] ^= 1;   // flip row
                }
            }
        }

        // Step 2: Flip columns if number of 0s > number of 1s
        for (int j = 1; j < n; j++) {
            int ones = 0;

            for (int i = 0; i < m; i++) {
                ones += grid[i][j];
            }

            if (ones < m - ones) {
                for (int i = 0; i < m; i++) {
                    grid[i][j] ^= 1;   // flip column
                }
            }
        }

        // Step 3: Calculate score
        int score = 0;

        for (int i = 0; i < m; i++) {
            int value = 0;

            for (int j = 0; j < n; j++) {
                value = value * 2 + grid[i][j];
            }

            score += value;
        }

        return score;
    }
}