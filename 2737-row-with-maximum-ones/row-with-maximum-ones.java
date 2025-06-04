class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[]{0,0}; 
        int max=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                    
                }
            }
             if(count>max){
                    result[0]=i;
                    result[1]=count;
                    max=count;
                }
        }
        return result;
        
    }
}