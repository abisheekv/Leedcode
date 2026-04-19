import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();

        // Add items1
        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        // Add items2
        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        // Convert to result list
        List<List<Integer>> result = new ArrayList<>();

        for (int key : map.keySet()) {
            result.add(Arrays.asList(key, map.get(key)));
        }

        // Sort by value (key)
        Collections.sort(result, (a, b) -> a.get(0) - b.get(0));

        return result;
    }
}