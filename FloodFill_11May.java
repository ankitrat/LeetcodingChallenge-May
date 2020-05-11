class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor =  image[sr][sc];
        if(oldColor == newColor) {
            return image;
        }
        floodFill(image,sr,sc,oldColor,newColor);
        return image;   
    }
    
    private void floodFill(int[][] image, int i, int j, int oldColor, int newColor) {
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]==newColor) {
            return;
        }
        if(image[i][j] == oldColor) {
            image[i][j] = newColor;
            floodFill(image,i-1,j,oldColor,newColor);
            floodFill(image,i,j-1,oldColor,newColor);
            floodFill(image,i+1,j,oldColor,newColor);
            floodFill(image,i,j+1,oldColor,newColor); 
        }
    }
}