class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] ch = new int[26];
        for(int i=0;i<magazine.length();i++) {
            ch[(magazine.charAt(i) - 'a')]++;
        }
        
        for(int i=0;i<ransomNote.length();i++) {
            int index = ransomNote.charAt(i)-'a';
            if(ch[index]==0) {
                return false;
            } else {
                ch[index]--;
            }
        }
        return true;
    }
}