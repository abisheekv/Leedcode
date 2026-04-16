import java.util.*;

class Solution {
    public int countPoints(String rings) {
        Set<Character>[] rods = new HashSet[10];

        // Initialize sets
        for (int i = 0; i < 10; i++) {
            rods[i] = new HashSet<>();
        }

        // Fill data
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            rods[rod].add(color);
        }

        // Count rods with all 3 colors
        int count = 0;
        for (Set<Character> set : rods) {
            if (set.size() == 3) {
                count++;
            }
        }

        return count;
    }
}