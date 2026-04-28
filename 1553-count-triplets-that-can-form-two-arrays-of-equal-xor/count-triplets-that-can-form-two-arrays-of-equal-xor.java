class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;
        int n = arr.length;

        // Iterate through every possible start index i
        for (int i = 0; i < n; i++) {
            int xorSum = arr[i];
            
            // Iterate through every possible end index k
            for (int k = i + 1; k < n; k++) {
                xorSum ^= arr[k];
                
                // If the XOR sum of the subarray [i...k] is 0,
                // then any j between i+1 and k is valid.
                // The number of such j values is (k - i).
                if (xorSum == 0) {
                    count += (k - i);
                }
            }
        }
        
        return count;
    }
}