class Solution {
    public int maxProfit(int[] prices) {
        int minPrice= Integer.MAX_VALUE;
        int ans=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                ans=Math.max(ans,price-minPrice);
            }
        }
        return ans;
        
    }
}