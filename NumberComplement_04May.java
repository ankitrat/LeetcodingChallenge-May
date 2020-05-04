/*
Algorithm used- 
1) Calculate no of bits in num
2) XOR of ((Math.pow(2,bitsLen))-1) and num
*/

class Solution {
    public int findComplement(int num) {
        if(num==0) {
            return 1;
        }
        if(num ==1){
            return 0;
        }
        int bitsLen  = noOfBits(num);
        return ((1<<bitsLen) -1)^num;   
        
    }
    
    public int noOfBits(int num) {
        int count=0;
        while(num>0) {
            int temp = num%2;
            num = num>>1;
            count++;
        }
       return count;
    }
}