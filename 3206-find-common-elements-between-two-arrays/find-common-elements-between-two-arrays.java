import java.util.*;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        int count1 = 0;
        int count2 = 0;

        // count elements of nums1 present in nums2
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }

        // count elements of nums2 present in nums1
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}