class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color= new int[n];
        Arrays.fill(color,-1);

        for(int i=0;i<n;i++){
            if(color[i]==-1){
                color[i]=0;
                Queue<Integer> q= new LinkedList<>();
                q.offer(i);
                while(!q.isEmpty()){
                    int node = q.poll();
                    for(int neigh:graph[node] ){
                        if(color[neigh]==color[node])return false;
                        if(color[neigh]==-1){
                            color[neigh]=1-color[node];
                            q.offer(neigh);
                        }
                    }
                }
            }
        }
        return true;
        
    }
}