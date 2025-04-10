class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c=image[sr][sc];
        if(c==color) return image;
        int row=image.length;
        int col=image[0].length;
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0];
            int y=cur[1];
            
            image[x][y]=color;
            for(int[]d :dir){
                int xn=x+d[0];
                int yn=y+d[1];
                if(xn>=0&&yn>=0&&xn<row&&yn<col&&image[xn][yn]==c){
                    q.add(new int[]{xn,yn});
                }
            }
        }
        return image;

        
    }
}