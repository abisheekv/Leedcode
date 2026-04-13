class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Remove closest non-digit to left
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}