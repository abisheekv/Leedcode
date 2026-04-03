class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        // If character not found
        if (index == -1) return word;

        // Reverse prefix
        String prefix = new StringBuilder(word.substring(0, index + 1))
                            .reverse()
                            .toString();

        // Remaining part
        String suffix = word.substring(index + 1);

        return prefix + suffix;
    }
}