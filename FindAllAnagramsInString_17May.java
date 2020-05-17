class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s==null || s.isEmpty()) {
            return ans;
        }
        
        int pLen = p.length();
        int sLen = s.length();
        if(sLen<pLen) {
            return ans;
        }
        
        int[] arr=new int[26];
       
        for(int i=0;i<pLen;i++) {
            arr[p.charAt(i)-'a']++;
        }
        
        for(int i=0;i<=sLen-pLen;i++) {
             int[] c=new int[26];
            for(int j=i;j<i+pLen;j++) {
                c[s.charAt(j)-'a']++;
            }
            if(isEquals(arr,c)) {
                ans.add(i);
            }
        }
        return ans;
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