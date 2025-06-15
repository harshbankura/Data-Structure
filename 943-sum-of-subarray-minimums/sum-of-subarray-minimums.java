class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD= 1_000_000_007;
        int n= arr.length;
        int[] left = new int[n];
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();
        // left me next smaller
        for(int i=0;i<n;i++){
            int curr=arr[i];
            while(!st.isEmpty()&&arr[st.peek()]>curr){
                st.pop();
            }
            left[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);

        } 
        st.clear();
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            while(!st.isEmpty()&&arr[st.peek()]>=curr){
                st.pop();
            }
            right[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);

        }

        // calculate;
        long ans=0;
        for(int i=0;i<n;i++){
            long prod = (long)arr[i]*left[i]*right[i];
              ans = (ans + prod) % MOD;
        }
        return (int)ans;
        
    }
}