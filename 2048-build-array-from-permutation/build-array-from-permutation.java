/**class Solution {
    public int[] buildArray(int[] nums) {
        final int n = nums.length;
        for (int i = 0; i < n; ++i) {
            nums[i] += n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; ++i) {
            nums[i] /= n;
        }
        return nums;
    }
}
**/
class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;      // Size of the array
        int[] ans = new int[n];   // Create a new array

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}