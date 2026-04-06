import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Find kth distinct
        for (String s : arr) {
            if (map.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }

        return "";
    }
}