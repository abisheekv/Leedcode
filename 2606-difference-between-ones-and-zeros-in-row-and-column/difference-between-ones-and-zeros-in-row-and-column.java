class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        // Count ones in rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }

        int[][] diff = new int[m][n];

        // Build answer matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int zerosRow = n - onesRow[i];
                int zerosCol = m - onesCol[j];

                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow - zerosCol;
            }
        }

        return diff;
    }
}