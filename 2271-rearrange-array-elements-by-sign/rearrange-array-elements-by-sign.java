class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i:nums){
            if(i>0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        for(int i=0;i<n/2;i++){
            ans[2*i]=pos.get(i);
            ans[(2*i)+1]=neg.get(i);
        }
        return ans;
        
    }
}