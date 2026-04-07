class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '0'; // last char is position
            result[pos - 1] = word.substring(0, len - 1); // remove number
        }

        return String.join(" ", result);
    }
}