class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int sufix=1;
        int max=Integer.MIN_VALUE;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(sufix==0) sufix=1;
            prefix=prefix*nums[i];
            sufix=sufix*nums[n-1-i];
            max=Math.max(max,Math.max(prefix,sufix));
        }
        return max;

        
    }
}