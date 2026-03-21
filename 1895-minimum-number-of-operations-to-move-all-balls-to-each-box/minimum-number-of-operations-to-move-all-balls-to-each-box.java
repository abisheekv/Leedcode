class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int count = 0; // number of balls
        int moves = 0; // total moves

        // Left to Right
        for (int i = 0; i < n; i++) {
            answer[i] += moves;
            if (boxes.charAt(i) == '1') count++;
            moves += count;
        }

        // Reset for Right to Left
        count = 0;
        moves = 0;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += moves;
            if (boxes.charAt(i) == '1') count++;
            moves += count;
        }

        return answer;
    }
}