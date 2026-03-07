class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Since nums.length is n + 2, n is nums.length - 2
        int n = nums.length - 2;
        
        // We use a frequency array to keep track of counts
        int[] counts = new int[n];
        int[] result = new int[2];
        int index = 0;
        
        for (int num : nums) {
            // Increment the count for this number
            counts[num]++;
            
            // If we've seen it twice, add it to our result list
            if (counts[num] == 2) {
                result[index++] = num;
            }
            
            // If we found both sneaky numbers, we can stop early
            if (index == 2) {
                break;
            }
        }
        
        return result;
    }
}