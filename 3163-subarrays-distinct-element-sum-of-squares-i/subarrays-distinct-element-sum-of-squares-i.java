import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int result = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums.get(j));   // add element
                int count = set.size(); // distinct count
                result += count * count;
            }
        }

        return result;
    }
}