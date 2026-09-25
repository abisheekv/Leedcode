class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] row = new int[m];
        int[] col = new int[n];
        
        // Step 1: Count increments
        for (int[] idx : indices) {
            row[idx[0]]++;
            col[idx[1]]++;
        }
        
        // Step 2: Count odd rows and columns
        int oddRows = 0, oddCols = 0;
        
        for (int r : row) {
            if (r % 2 == 1) oddRows++;
        }
        
        for (int c : col) {
            if (c % 2 == 1) oddCols++;
        }
        
        // Step 3: Apply formula
        return (oddRows * (n - oddCols)) + ((m - oddRows) * oddCols);
    }
}