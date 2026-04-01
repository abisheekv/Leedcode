class Solution {
    public String decodeMessage(String key, String message) {
        
        Map<Character, Character> map = new HashMap<>();
        char ch = 'a';
        
        // Build mapping
        for (char c : key.toCharArray()) {
            if (c != ' ' && !map.containsKey(c)) {
                map.put(c, ch);
                ch++;
            }
        }
        
        // Decode message
        StringBuilder result = new StringBuilder();
        
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else {
                result.append(map.get(c));
            }
        }
        
        return result.toString();
    }
}