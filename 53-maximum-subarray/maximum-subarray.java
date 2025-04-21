class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            sum=Math.max(num,sum+num);
            res=Math.max(sum,res);
        }
        return res;
        
    }
}