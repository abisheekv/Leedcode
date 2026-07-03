import java.util.*;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        // Store unique active minutes for each user
        for (int[] log : logs) {
            int id = log[0];
            int time = log[1];

            map.putIfAbsent(id, new HashSet<>());
            map.get(id).add(time);
        }

        int[] answer = new int[k];

        // Count users by their UAM
        for (Set<Integer> times : map.values()) {
            int uam = times.size();
            answer[uam - 1]++;
        }

        return answer;
    }
}