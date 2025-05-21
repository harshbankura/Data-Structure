class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Boolean check[] = new Boolean[nums.length];

        for(int i:nums){
            check[i-1]=true;
          
        } 
        for(int i=0;i<nums.length;i++){
            if(check[i]==null){
                ans.add(i+1);
            }
        }
        return ans;
    }
}