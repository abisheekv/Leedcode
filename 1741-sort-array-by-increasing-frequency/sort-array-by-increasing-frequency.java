class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert int[] to Integer[]
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Sort based on frequency
        Arrays.sort(arr, (a, b) -> {

            int freqA = map.get(a);
            int freqB = map.get(b);

            // Increasing frequency
            if (freqA != freqB) {
                return freqA - freqB;
            }

            // Same frequency -> decreasing value
            return b - a;
        });

        // Convert back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}