class Solution {
    public int[] finalPrices(int[] prices) {
        int[] dis = new int[prices.length]; 
        Stack<Integer> st=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            int curr=prices[i];
            while(!st.isEmpty()&&st.peek()>curr){
                st.pop();
            }
            dis[i]=st.isEmpty()?0:st.peek();
            st.push(curr);
        }
        for(int i=0;i<prices.length;i++){
            prices[i]-=dis[i];
        }
        return prices;
        
    }
}