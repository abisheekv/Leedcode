class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        int maxFreq = 0;

        // Find maximum frequency
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int total = 0;

        // Add frequencies equal to max frequency
        for (int f : freq) {
            if (f == maxFreq) {
                total += f;
            }
        }

        return total;
    }
}