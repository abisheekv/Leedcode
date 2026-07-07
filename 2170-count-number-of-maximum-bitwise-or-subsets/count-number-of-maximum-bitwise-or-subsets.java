class Solution {
    int maxOr = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {

        // Find the maximum possible OR
        for (int num : nums) {
            maxOr |= num;
        }

        dfs(nums, 0, 0);

        return count;
    }

    private void dfs(int[] nums, int index, int currentOr) {

        // If all elements are considered
        if (index == nums.length) {
            if (currentOr == maxOr) {
                count++;
            }
            return;
        }

        // Include current element
        dfs(nums, index + 1, currentOr | nums[index]);

        // Exclude current element
        dfs(nums, index + 1, currentOr);
    }
}