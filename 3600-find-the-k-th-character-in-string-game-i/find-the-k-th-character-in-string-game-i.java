class Solution {
    public char kthCharacter(int k) {
        int shift = 0;

        while (k > 1) {
            int length = 1;

            // Find largest power of 2 <= k
            while (length * 2 < k) {
                length *= 2;
            }

            // If k is in second half
            if (k > length) {
                k -= length;
                shift++;
            }
        }

        // Return final character
        return (char) ('a' + (shift % 26));
    }
}