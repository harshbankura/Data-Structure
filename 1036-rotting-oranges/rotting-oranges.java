class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int time=0;

        while(!q.isEmpty()&& count>0){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                int x = curr[0];
                int y= curr[1];

                for(int[] d:dir){
                    int xn=x+d[0];
                    int yn =y+d[1];
                    if(xn>=0&&yn>=0&&xn<row&&yn<col){
                        if(grid[xn][yn]==1){
                            grid[xn][yn]=2;
                            count--;
                            q.add(new int[]{xn,yn});
                        }
                    }

                } 
            }
        }
        return count>0?-1:time;

        
    }
}