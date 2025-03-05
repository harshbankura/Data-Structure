class Solution {
    public long coloredCells(int n) {
        return sq(n)+sq(n-1);
        
        
    }
    private long sq(int n){
        return (long)n*n;
    }
}