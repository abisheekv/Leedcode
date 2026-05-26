class Solution {
    int count = 0;
    String result = "";

    public String getHappyString(int n, int k) {
        backtrack("", n, k);
        return result;
    }

    private void backtrack(String curr, int n, int k) {
        // Stop if already found
        if (!result.equals("")) return;

        // If length becomes n
        if (curr.length() == n) {
            count++;

            if (count == k) {
                result = curr;
            }
            return;
        }

        char[] chars = {'a', 'b', 'c'};

        for (char ch : chars) {
            // Avoid adjacent same characters
            if (curr.length() == 0 || curr.charAt(curr.length()-1) != ch) {
                backtrack(curr + ch, n, k);
            }
        }
    }
}