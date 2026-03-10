class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        
        // Count number of 1s
        for(char c : s.toCharArray()){
            if(c == '1'){
                ones++;
            }
        }
        
        int zeros = s.length() - ones;
        
        StringBuilder result = new StringBuilder();
        
        // Add remaining 1s at beginning
        for(int i = 0; i < ones - 1; i++){
            result.append('1');
        }
        
        // Add zeros
        for(int i = 0; i < zeros; i++){
            result.append('0');
        }
        
        // Add last 1 to make it odd
        result.append('1');
        
        return result.toString();
    }
}