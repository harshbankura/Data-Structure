class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max=0;
        int array[] = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[j]=(matrix[i][j]=='1')?array[j]+1:0;
            }
            max=Math.max(max,largestRectangleArea(array));
        }
        return max;

        
    }
        private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i]; // Add 0 height at the end to flush the stack
            
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            
            stack.push(i);
        }
        
        return maxArea;
    }
}