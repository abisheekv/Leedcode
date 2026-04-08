class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        int sum = 0;
        int num = x;
        
        // Step 1: Find sum of digits
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        // Step 2: Check Harshad condition
        if (x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}