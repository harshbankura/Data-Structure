class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans= new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(top<=bottom&&right>=left){
            //left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
                
            }
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
                
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(right>=left){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }




        }
        return ans;
        
    }
}