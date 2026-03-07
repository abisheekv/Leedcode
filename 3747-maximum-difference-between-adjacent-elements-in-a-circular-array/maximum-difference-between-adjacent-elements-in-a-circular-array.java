class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Use modulo to wrap the index back to 0 for the last element
            int currentDiff = Math.abs(nums[i] - nums[(i + 1) % n]);
            
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }
        }

        return maxDiff;
    }
}