class Solution {
    public int findJudge(int N, int[][] trust) {  
        if(trust.length==1) {
            return trust[0][1];
        }

        int[] t = new int[N];
        int[] t1 = new int[N];
        
        for(int i=0;i<trust.length;i++) {
            int x = trust[i][0];
            int y = trust[i][1];
            
            t[x-1] = t[x-1]+1;
            t1[y-1] = t1[y-1]+1; 
        }
        
        for(int i=0;i<t.length;i++) {
            if(t[i] == 0 && t1[i]==N-1) {
                return i+1;
            }
        }
        return -1;
    }
}