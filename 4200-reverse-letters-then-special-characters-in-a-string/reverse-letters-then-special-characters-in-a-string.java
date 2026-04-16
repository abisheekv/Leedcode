import java.util.*;

class Solution {
    public String reverseByType(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> specials = new ArrayList<>();

        // Step 1: Separate
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            } else {
                specials.add(c);
            }
        }

        // Step 2: Reverse both
        Collections.reverse(letters);
        Collections.reverse(specials);

        // Step 3: Rebuild string
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters.get(i++));
            } else {
                result.append(specials.get(j++));
            }
        }

        return result.toString();
    }

}