class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        int targetCount = 0;
        for (int count : counts) {
            if (count > 0) {
                if (targetCount == 0) {
                    targetCount = count;
                } else if (count != targetCount) {
                    return false;
                }
            }
        }

        return true;
    }
}