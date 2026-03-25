class Solution {
    public int minBitFlips(int start, int goal) {
        int diff = start ^ goal;
        int count = 0;
        
        while (diff > 0) {
            count += diff & 1; // check last bit
            diff >>= 1;        // shift right
        }
        
        return count;
    }
}