import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        boolean[] seen = new boolean[n];

        // Mark valid indices
        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                int left = Math.max(0, j - k);
                int right = Math.min(n - 1, j + k);

                for (int i = left; i <= right; i++) {
                    seen[i] = true;
                }
            }
        }

        // Collect result
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (seen[i]) {
                result.add(i);
            }
        }

        return result;
    }
}