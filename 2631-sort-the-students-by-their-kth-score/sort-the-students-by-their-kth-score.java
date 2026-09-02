import java.util.Arrays;

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        // Sort rows in descending order based on the value at index k
        Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));
        return score;
    }
}