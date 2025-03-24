class Solution {
    public int maxDepth(String s) {
        int maxD=0;
        int D=0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                D++;
                maxD=Math.max(D,maxD);
            }else if(ch == ')'){
                D--;
            }
        }
        return maxD;
        
    }
}