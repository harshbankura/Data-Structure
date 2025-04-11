class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
         int row=grid.length;
         int col=grid[0].length;
        for(int i=0;i<row;i++){
            if(grid[i][0]==1){
                dfs(i,0,row,col,grid);

            }
            if(grid[i][col-1]==1){
                dfs(i,col-1,row,col,grid);

            }
        }
        for(int i=0;i<col;i++){
            if(grid[0][i]==1){
                dfs(0,i,row,col,grid);

            }
            if(grid[row-1][i]==1){
                dfs(row-1,i,row,col,grid);

            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    count++;
                    grid[i][j]=0;
                }
                if(grid[i][j]==-1){
                    grid[i][j]=1;
                }
            }
        }
        return count;
        
    }
     public void dfs(int i,int j,int row,int col, int[][] grid){
        if(i<0||i>=row||j<0||j>=col||grid[i][j]!=1) return;
        grid[i][j]=-1;
        dfs(i+1,j,row,col,grid);
        dfs(i-1,j,row,col,grid);
        dfs(i,j+1,row,col,grid);
        dfs(i,j-1,row,col,grid);
    }
}