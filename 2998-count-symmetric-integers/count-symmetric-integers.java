class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for (int num = low; num <= high; num++) {
            String s = String.valueOf(num);
            
            // Skip odd length
            if (s.length() % 2 != 0) continue;
            
            int n = s.length() / 2;
            int leftSum = 0, rightSum = 0;
            
            for (int i = 0; i < n; i++) {
                leftSum += s.charAt(i) - '0';
                rightSum += s.charAt(i + n) - '0';
            }
            
            if (leftSum == rightSum) {
                count++;
            }
        }
        
        return count;
    }

}