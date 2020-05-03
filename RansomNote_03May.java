class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {  
        int[] ch = new int[26];
        char[] mag = magazine.toCharArray();
        for(int i=0;i<mag.length;i++) {
            ch[(mag[i] - 'a')]++;
        }
        
        char[] ransom = ransomNote.toCharArray();
        for(int i=0;i<ransom.length;i++) {
            if(ch[ransom[i]-'a']==0) {
                return false;
            } else {
                ch[ransom[i]-'a']--;
            }
        }
        return true;
    }
}
