/*
Solution  - 
1) Compute the slope from first point,
2) If all the points is making a straight line then their slope from first point will be same,
3) To copute slope between 2 points, use below formula 
	slope=(y2-y1)/(x2-x1)
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length ==2) {
            return true;
        }
        int[] x = coordinates[0];
        int[] y = coordinates[1];
        float gSlope = findSlope(x,y);
        
        for(int i=2;i<coordinates.length;i++) {
            float slope = findSlope(x, coordinates[i]);
            if(gSlope!=slope) {
                return false;
            }
        }
        return true;
        
    }
    private float findSlope(int[] x, int[] y) {
        if((y[0]-x[0]) ==0) {
            return 0;
        }
         return (float)(y[1] - x[1])/(y[0]-x[0]);
    }
}