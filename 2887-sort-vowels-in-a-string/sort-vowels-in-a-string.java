import java.util.*;

class Solution {

    // Function to check vowel
    public boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    public String sortVowels(String s) {

        List<Character> vowels = new ArrayList<>();

        // Collect vowels
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        // Sort vowels by ASCII value
        Collections.sort(vowels);

        StringBuilder result = new StringBuilder();
        int index = 0;

        // Replace vowels in sorted order
        for (char ch : s.toCharArray()) {

            if (isVowel(ch)) {
                result.append(vowels.get(index++));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}