class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        // Maximum value
        char maxDigit = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                maxDigit = c;
                break;
            }
        }

        String maxStr = s;
        if (maxDigit != ' ') {
            maxStr = s.replace(maxDigit, '9');
        }

        // Minimum value
        char minDigit = s.charAt(0);
        String minStr = s.replace(minDigit, '0');

        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}