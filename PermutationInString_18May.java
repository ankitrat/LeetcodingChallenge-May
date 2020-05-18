class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if(s1Len==0 && s2Len==0) {
            return false;
        }
        
        if(s1Len>s2Len) {
            return false;
        }
        
        int[] arr= new int[26];
        for(int i=0;i<s1Len;i++) {
            arr[s1.charAt(i)-'a']++;
        }
        
        for(int i=0;i<=s2Len-s1Len;i++) {
            int[] c = new int[26];
            for(int j=i;j<i+s1Len;j++) {
                c[s2.charAt(j)-'a']++;
            }
            if(isEquals(arr,c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isEquals(int[] arr, int[] c) {
        for(int i=0;i<26;i++) {
            if(arr[i]!=c[i]) {
                return false;
            }
        }
        return true;
    }
    
}