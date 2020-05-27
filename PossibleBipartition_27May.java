class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if(dislikes==null || dislikes.length <=1){
            return true;
        }
        List<List<Integer>> graph = new ArrayList<>(N+1);
        
        for(int i=0;i<=N;i++) {
            graph.add(new ArrayList<Integer>());
        }
        for(int[] d : dislikes) {
            graph.get(d[0]).add(d[1]);
            graph.get(d[1]).add(d[0]);
        }
        
        int[] color = new int[N+1];
        for(int i=1;i<=N;i++) {
            if(color[i]!=0) {
                continue;
            }
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i]=1;
            while(!q.isEmpty()) {
                Integer temp = q.poll();
                System.out.println(temp);
                for(Integer x : graph.get(temp)) {
                    if(color[x]==color[temp]) {
                        return false;
                    }
                    if(color[x]==0) {
                        color[x] = -color[temp];
                        q.add(x);
                    }
                }
            } 
        }
        return true;
    }
}