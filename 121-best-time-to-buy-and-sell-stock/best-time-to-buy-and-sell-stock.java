class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:prices){
            if(i<min){
                min=i;
            }else{
                int profit = i-min;
                max=Math.max(max,profit);
            }
        }
        return max;
        
    }
}