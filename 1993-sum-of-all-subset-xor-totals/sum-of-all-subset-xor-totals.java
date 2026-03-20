class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }

    private int backtrack(int[] nums, int index, int currentXOR) {
        // Base case
        if (index == nums.length) {
            return currentXOR;
        }

        // Include current element
        int include = backtrack(nums, index + 1, currentXOR ^ nums[index]);

        // Exclude current element
        int exclude = backtrack(nums, index + 1, currentXOR);

        return include + exclude;
    }
}