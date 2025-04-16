class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n= grid.length;
        
        if(grid[0][0]==1||grid[n-1][n-1]==1)return -1;
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q= new LinkedList<>();
        int[][] dir = {{-1,-1},{-1,0},{-1,1},
                       {0,-1},{0,1},
                       {1,-1},{1,0},{1,1}};

        q.offer(new int[]{0,0,1});
        visited[0][0]=true;
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];
            int dist=curr[2];
            if((x==n-1)&&(y==n-1))return dist;
            for(int[]d:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx>=0&&nx<n&&ny>=0&&ny<n&&grid[nx][ny]==0&&(!visited[nx][ny])){
                    q.offer(new int[]{nx,ny,dist+1});
                    visited[nx][ny]=true;
                }

            }

        }
        return -1;
    }
}