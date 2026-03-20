class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        // Step 1: store allowed characters
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        int count = 0;

        // Step 2: check each word
        for (String word : words) {
            boolean isValid = true;

            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }
}