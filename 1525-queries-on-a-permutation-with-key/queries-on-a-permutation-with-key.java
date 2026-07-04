import java.util.*;

class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> permutation = new ArrayList<>();

        // Initialize permutation [1, 2, ..., m]
        for (int i = 1; i <= m; i++) {
            permutation.add(i);
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int position = permutation.indexOf(queries[i]);
            answer[i] = position;

            permutation.remove(position);
            permutation.add(0, queries[i]);
        }

        return answer;
    }
}