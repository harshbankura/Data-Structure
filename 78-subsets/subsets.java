class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        work(0,nums, ans , new ArrayList<Integer>());
        return ans;
        
    }
    private static void work(int index , int[] nums,ArrayList<List<Integer>> ans , ArrayList<Integer> ds ){
        if(index==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        work(index+1,nums,ans, ds);
          ds.remove(ds.size() - 1);
        
        work(index+1,nums,ans, ds);

    }
}