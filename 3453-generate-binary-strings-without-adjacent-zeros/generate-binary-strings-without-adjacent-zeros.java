class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        work(n,1,"",ans);
        return ans;
        
    }
    private static void work(int n , int last , String s ,List<String> ans ){
        if(n==0){
            ans.add(s);
            return;
        }
        work(n-1,1,s+"1",ans);
        if(last==1){
            work(n-1,0,s+"0",ans);
        }
    }
}