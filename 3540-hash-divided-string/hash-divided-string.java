class Solution {
    public String stringHash(String s, int k) {

        StringBuilder result = new StringBuilder();

        // Process every substring of length k
        for (int i = 0; i < s.length(); i += k) {

            int sum = 0;

            // Calculate hash value of substring
            for (int j = i; j < i + k; j++) {
                sum += s.charAt(j) - 'a';
            }

            // Find hashed character
            char hashedChar = (char)((sum % 26) + 'a');

            result.append(hashedChar);
        }

        return result.toString();
    }
}