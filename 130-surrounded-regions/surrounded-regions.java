class Solution {
    public void solve(char[][] board) {
         int row=board.length;
         int col=board[0].length;
        for(int i=0;i<row;i++){
            if(board[i][0]=='O'){
                dfs(i,0,row,col,board);

            }
            if(board[i][col-1]=='O'){
                dfs(i,col-1,row,col,board);

            }
        }
        for(int i=0;i<col;i++){
            if(board[0][i]=='O'){
                dfs(0,i,row,col,board);

            }
            if(board[row-1][i]=='O'){
                dfs(row-1,i,row,col,board);

            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(int i,int j,int row,int col, char[][] board){
        if(i<0||i>=row||j<0||j>=col||board[i][j]!='O') return;
        board[i][j]='T';
        dfs(i+1,j,row,col,board);
        dfs(i-1,j,row,col,board);
        dfs(i,j+1,row,col,board);
        dfs(i,j-1,row,col,board);
    }
}