class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, "", result);
        return result;
    }

    private void backtrack(int n, String curr, List<String> result) {
        if (curr.length() == n) {
            result.add(curr);
            return;
        }

        // Always can add '1'
        backtrack(n, curr + "1", result);

        // Add '0' only if previous character is not '0'
        if (curr.isEmpty() || curr.charAt(curr.length() - 1) == '1') {
            backtrack(n, curr + "0", result);
        }
    }
}