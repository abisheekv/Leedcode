class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;

        // Prefix sum of travel times
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + travel[i - 1];
        }

        int total = 0;
        int lastM = 0, lastP = 0, lastG = 0;

        for (int i = 0; i < n; i++) {
            total += garbage[i].length(); // Time to pick garbage

            if (garbage[i].indexOf('M') != -1)
                lastM = i;
            if (garbage[i].indexOf('P') != -1)
                lastP = i;
            if (garbage[i].indexOf('G') != -1)
                lastG = i;
        }

        total += prefix[lastM];
        total += prefix[lastP];
        total += prefix[lastG];

        return total;
    }
}