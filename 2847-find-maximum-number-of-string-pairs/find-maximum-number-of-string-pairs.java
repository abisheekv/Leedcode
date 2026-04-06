import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();

            if (set.contains(rev)) {
                count++;
                set.remove(rev); // prevent reuse
            } else {
                set.add(word);
            }
        }

        return count;
    }
}