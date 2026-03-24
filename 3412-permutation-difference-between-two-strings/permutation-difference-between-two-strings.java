class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] pos = new int[26]; // store index of chars in s

        // Step 1: store positions of s
        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'] = i;
        }

        // Step 2: calculate difference
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result += Math.abs(pos[t.charAt(i) - 'a'] - i);
        }

        return result;
    }
}