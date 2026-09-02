class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        
        // 1. Count occurrences of each number
        for (int num : nums) {
            count[num + 1]++;
        }
        
        // 2. Compute prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        // 3. Construct result array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}