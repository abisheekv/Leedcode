class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // Bottom-left triangle (including main diagonal)
        for (int row = 0; row < n; row++) {
            sortDiagonal(grid, row, 0, false);
        }

        // Top-right triangle (excluding main diagonal)
        for (int col = 1; col < n; col++) {
            sortDiagonal(grid, 0, col, true);
        }

        return grid;
    }

    private void sortDiagonal(int[][] grid, int row, int col, boolean ascending) {
        int n = grid.length;
        ArrayList<Integer> list = new ArrayList<>();

        int r = row, c = col;

        // Collect diagonal elements
        while (r < n && c < n) {
            list.add(grid[r][c]);
            r++;
            c++;
        }

        // Sort
        Collections.sort(list);
        if (!ascending) {
            Collections.reverse(list);
        }

        // Put back into matrix
        r = row;
        c = col;
        int index = 0;
        while (r < n && c < n) {
            grid[r][c] = list.get(index++);
            r++;
            c++;
        }
    }
}