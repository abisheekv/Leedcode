
class Solution {
    public int[] transformArray(int[] nums) {
        // Step 1 & 2: Replace values
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        // Step 3: Sort
        Arrays.sort(nums);

        return nums;
    }
}