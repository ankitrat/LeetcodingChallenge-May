/*
Algorithm is  - 
1) Find maximum sum subarray using Kadane's algorithm
{Either perform step 2 or step 3 , if performing step 3 , skip step 4}
2) Find minimum sum subarray using Kadane's algorithm 
3) or Find maximum sum subarray by reverting all elements of array. i.e -maximum sum of reverted array =  total sum - minimum sum. 
3) find total/sum of array elements
4) Ans would be maximum of (maximum sum , total sum - minimum sum);
*/

class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int curr_max = A[0];
        int max = A[0];
        int curr_min = A[0];
        int min = A[0];
        int total = A[0];
        
        for(int i=1;i<A.length;i++) {
            curr_max = curr_max+A[i];
            curr_min = curr_min+A[i];
            if(curr_max<A[i]) {
                curr_max = A[i];
            }
            if(curr_max>max) {
                max = curr_max;
            }
            
            if(curr_min>A[i]) {
                curr_min = A[i];
            }
            if(min>curr_min) {
                min = curr_min;
            }            
            total = total+A[i];
        }
        
        return max<0? max :Math.max(max,total-min);      
    }
}