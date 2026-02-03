class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Apply operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Move zeros to the end
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < n) {
            nums[index++] = 0;
        }

        return nums;
    }
}
