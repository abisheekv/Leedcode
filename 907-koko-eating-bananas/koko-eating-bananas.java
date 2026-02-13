class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hours = 0;

            for (int pile : piles) {
                // ceil(pile / mid)
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                right = mid - 1; // try slower speed
            } else {
                left = mid + 1;  // need faster speed
            }
        }
        return left;
    }
}
