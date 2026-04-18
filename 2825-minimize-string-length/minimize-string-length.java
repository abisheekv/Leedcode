class Solution {
    public int minimizedStringLength(String s) {
        // Use a HashSet to store unique characters
        Set<Character> set = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        
        // Size of set = number of distinct characters
        return set.size();
    }
}