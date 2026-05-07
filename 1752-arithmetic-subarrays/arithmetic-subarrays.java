class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {

            // Create subarray
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i] + 1);

            // Sort subarray
            Arrays.sort(arr);

            // Find common difference
            int diff = arr[1] - arr[0];

            boolean ok = true;

            // Check arithmetic sequence
            for (int j = 1; j < arr.length - 1; j++) {

                if (arr[j + 1] - arr[j] != diff) {
                    ok = false;
                    break;
                }
            }

            ans.add(ok);
        }

        return ans;
    }
}