class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[]= new boolean[n];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                count++;
            }

        }
        return count;
        
    }
    private void dfs(int n,int[][] isConnected,boolean vis[]){
        vis[n]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[n][i]==1&& !vis[i]){
                dfs(i,isConnected,vis);
            }
        }
    }
}