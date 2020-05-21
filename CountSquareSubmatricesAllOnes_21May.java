class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0] == 1) {
                count = count+matrix[i][0];
            }
        }
        
        for(int i=1;i<matrix[0].length;i++) {
            if(matrix[0][i] == 1) {
                 count = count+matrix[0][i];
            }
        }
        
    
        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][j] ==1) {
                    matrix[i][j] = min(matrix[i-1][j-1],matrix[i-1][j],matrix[i][j-1])+1;
                    count = count + matrix[i][j]; 
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