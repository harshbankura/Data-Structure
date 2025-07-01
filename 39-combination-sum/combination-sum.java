class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        work(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
    private static void work(int index,int[] arr,int target,List<List<Integer>> ans, ArrayList<Integer> ds){
        if(arr.length==index){
            if(target==0){
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            
        work(index,arr,target-arr[index],ans,ds);
        ds.remove(ds.size()-1);


        }
        
        work(index+1,arr,target,ans,ds);
    }
}