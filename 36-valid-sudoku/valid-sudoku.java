import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                
                // Skip empty cells
                if (val != '.') {
                    // Try to insert row, col, and box identifiers.
                    // If any .add() returns false, a duplicate exists!
                    if (!seen.add("row " + r + " " + val) ||
                        !seen.add("col " + c + " " + val) ||
                        !seen.add("box " + (r / 3) + "-" + (c / 3) + " " + val)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}