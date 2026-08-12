class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){//row
            int sum =0;
            for(int j=0;j< accounts[i].length;j++){//columns
                sum+= accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
        
    }
}