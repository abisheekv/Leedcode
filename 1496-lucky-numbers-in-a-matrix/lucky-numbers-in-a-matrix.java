import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] rowMin = new int[m];
        java.util.Arrays.fill(rowMin, Integer.MAX_VALUE);
        int[] colMax = new int[n];
        
        // Step 1: Find the minimum for each row and maximum for each column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Step 2: Check which elements meet both criteria
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        
        return result;
    }
}