class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int maxOdd = 0, minEven = Integer.MAX_VALUE;
        
        for (int f : freq) {
            if (f > 0) {  // Only count existing chars
                if (f % 2 == 1) {
                    maxOdd = Math.max(maxOdd, f);
                } else {
                    minEven = Math.min(minEven, f);
                }
            }
        }
        
        // No even freq found
        if (minEven == Integer.MAX_VALUE) return -1;
        
        return maxOdd - minEven;
    }
}
