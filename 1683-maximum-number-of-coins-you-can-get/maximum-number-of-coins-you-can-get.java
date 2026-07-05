import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int left = 0;
        int right = piles.length - 1;
        int ans = 0;

        while (left < right) {
            right--;                 // Skip Alice's largest pile
            ans += piles[right];     // You take the second largest
            right--;
            left++;                  // Bob takes the smallest
        }

        return ans;
    }
}