class Solution {
    public boolean canAliceWin(int[] nums) {

        int singleSum = 0;
        int doubleSum = 0;

        // Step 1: split sums
        for (int num : nums) {
            if (num < 10) {
                singleSum += num;
            } else {
                doubleSum += num;
            }
        }

        int total = singleSum + doubleSum;

        // Step 2: check both choices
        if (singleSum > total - singleSum) {
            return true;
        }

        if (doubleSum > total - doubleSum) {
            return true;
        }

        return false;
    }
}
