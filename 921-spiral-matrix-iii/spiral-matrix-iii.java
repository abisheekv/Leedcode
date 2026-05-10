class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] result = new int[rows * cols][2];

        // Directions: East, South, West, North
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        int count = 0;
        int steps = 1;

        int r = rStart;
        int c = cStart;

        // First position
        result[count++] = new int[]{r, c};

        while (count < rows * cols) {

            // 4 directions
            for (int d = 0; d < 4; d++) {

                // Move 'steps' times
                for (int i = 0; i < steps; i++) {

                    r += dir[d][0];
                    c += dir[d][1];

                    // Check if inside grid
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count++] = new int[]{r, c};

                        if (count == rows * cols) {
                            return result;
                        }
                    }
                }

                // Increase steps after East and West
                if (d == 1 || d == 3) {
                    steps++;
                }
            }
        }

        return result;
    }
}