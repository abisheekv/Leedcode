import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        Set<Integer> present = new HashSet<>();

        // Find min, max, and store elements in set
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
            present.add(num);
        }

        List<Integer> result = new ArrayList<>();

        // Check for missing elements in ascending order
        for (int i = minVal; i <= maxVal; i++) {
            if (!present.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}