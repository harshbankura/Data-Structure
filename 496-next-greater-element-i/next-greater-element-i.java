class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack <Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int curr = nums2[i];
            while(!st.isEmpty()&&st.peek()<=curr){
                st.pop();
            }
            map.put(curr,st.isEmpty()?-1:st.peek());
            st.push(curr);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int curr=nums1[i];
            result[i]=map.get(curr);
        }
        return result;
        
    }
}