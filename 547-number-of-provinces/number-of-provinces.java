class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean vis[]= new boolean[n];
        int prov=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                prov++;
            }
        }
        return prov;
        
    }
    private void dfs(int node,int[][] isConnected , boolean vis[]){
        vis[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1&&!vis[i]){
                dfs(i,isConnected,vis);
            }
        }
    }
}