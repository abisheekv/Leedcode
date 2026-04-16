class Solution {
    public int minMoves(int[] nums) {
        int max = 0;

        // Find max
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int moves = 0;

        // Calculate moves
        for (int num : nums) {
            moves += (max - num);
        }

        return moves;
    }
}