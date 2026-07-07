class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int n = nums.length;
        int[] answer = new int[n];

        int xor = 0;

        // XOR of all elements
        for (int num : nums) {
            xor ^= num;
        }

        int mask = (1 << maximumBit) - 1;

        for (int i = 0; i < n; i++) {

            answer[i] = xor ^ mask;

            // Remove last element
            xor ^= nums[n - 1 - i];
        }

        return answer;
    }
}