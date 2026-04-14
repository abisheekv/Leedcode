class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {   // special index
                int val = nums[i - 1];  // 1-index → 0-index
                sum += val * val;
            }
        }

        return sum;
    }
}