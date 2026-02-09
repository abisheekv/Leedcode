class Solution {
    public boolean digitCount(String num) {

        int[] count = new int[10];

        // Step 1: count digits
        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }

        // Step 2: verify condition
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            if (count[i] != expected) {
                return false;
            }
        }

        return true;
    }
}
