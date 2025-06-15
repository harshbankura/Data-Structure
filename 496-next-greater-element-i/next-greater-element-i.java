class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int curr = nums2[i];
            while(!st.isEmpty()&&st.peek()<=curr){
                st.pop();
            }
            map.put(curr,st.isEmpty()?-1:st.peek());
            st.push(curr);

        }
        int ans[]= new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            int curr=nums1[i];
            ans[i]=map.get(curr);
        }
        return ans;
        
    }
}