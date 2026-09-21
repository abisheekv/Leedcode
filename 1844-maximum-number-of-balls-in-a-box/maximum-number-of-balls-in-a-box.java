class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[50];
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = digitSum(i);
            box[sum]++;
            max = Math.max(max, box[sum]);
        }

        return max;
    }

    private int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}