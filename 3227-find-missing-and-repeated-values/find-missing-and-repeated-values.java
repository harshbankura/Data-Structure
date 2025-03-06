class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int nl=n*n;
        int arr[]= new int[nl+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[grid[i][j]]++;
            }
        }
        int r=-1,m=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                 r=i;
            }
            if(arr[i]==0){
                 m=i;
            }
        }
        return new int[]{r,m};
        
    }
}