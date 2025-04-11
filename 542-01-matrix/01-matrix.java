class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        Queue<int[]>q=new LinkedList<>();
        int[][] result = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }else{
                    result[i][j]=-1;
                }

            }
        }
        int[][] dir= {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int[]d:dir){
                int xn=x+d[0];
                int yn=y+d[1];
                if(xn>=0&&xn<row&&yn>=0&&yn<col&&result[xn][yn]==-1){
                    result[xn][yn]=result[x][y]+1;
                    q.offer(new int[]{xn,yn});
                }
            }
        }
        return result;
        
    }
}