class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            result.append(temp.reverse().toString()).append(" ");
        }

        // remove last extra space
        return result.toString().trim();
    }
}