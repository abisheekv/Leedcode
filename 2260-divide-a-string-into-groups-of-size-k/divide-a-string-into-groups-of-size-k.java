class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groups = (n + k - 1) / k;   // number of groups
        
        String[] result = new String[groups];
        int index = 0;

        for (int i = 0; i < groups; i++) {
            StringBuilder temp = new StringBuilder();

            for (int j = 0; j < k; j++) {
                if (index < n) {
                    temp.append(s.charAt(index));
                    index++;
                } else {
                    temp.append(fill);
                }
            }

            result[i] = temp.toString();
        }

        return result;
    }
}