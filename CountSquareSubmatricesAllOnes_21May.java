class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        
        int count = 0;
        for(int i=0;i<matrix.length;i++) {
            dp[i][0] = matrix[i][0];
            count = count+dp[i][0];
        }
        
        for(int i=1;i<matrix[0].length;i++) {
            dp[0][i] = matrix[0][i];
            count = count+dp[0][i];
        }
        
        
        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][j] ==0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])+1;
                    count = count + dp[i][j];
                }
            }
        }
        return count;
    }
    
    public int min(int a, int b, int c) {
        if(a<b) {
            if(a<c) {
                return a;
            }
            return c;
        } 
        else {
             if(b<c) {
                return b;
            }
            return c;
        }
    }
    
}