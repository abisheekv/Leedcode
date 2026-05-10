import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        // Store unique elements
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Convert set to list
        List<Integer> list = new ArrayList<>(set);

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Take at most k elements
        int size = Math.min(k, list.size());
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}