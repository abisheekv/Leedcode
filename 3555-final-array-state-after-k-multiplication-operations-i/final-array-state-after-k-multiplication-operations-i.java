class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int step = 0; step < k; step++) {
            int minIndex = 0;
            
            // Find the index of the first minimum value
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            
            // Multiply the minimum element
            nums[minIndex] *= multiplier;
        }
        
        return nums;
    }
}