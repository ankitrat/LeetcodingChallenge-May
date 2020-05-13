/*
Facts for this solution - 
1) 2ms to execute
2) beats 98.33% in terms of time complexity

*/

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() ==k) {
            return "0";
        }
        
        StringBuffer sb = new StringBuffer(num);       
        for(int i=0;i<sb.length()-1;) {
            if(sb.charAt(i) > sb.charAt(i+1)) {
                sb.deleteCharAt(i);
                k--;
                i--;
                if(i<0) {
                    i=0;
                }
            } else {
                 i++;
            }
            if(k==0) {
                break;
            }
        }
        int newLen = sb.length();
        while(k>0) {
            sb.deleteCharAt(--newLen);
            k--;
        }
        
        trim(sb);
        return sb.toString();
    }
    public void trim(StringBuffer sb) {
        if(sb.length()==1) {
            return;
        }
        if(sb.charAt(0) != '0') {
            return;
        } else {
            sb.deleteCharAt(0);
            trim(sb);
        }
    }
} 