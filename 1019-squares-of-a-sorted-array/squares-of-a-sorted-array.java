class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int sl=nums[left]*nums[left];
            int sr=nums[right]*nums[right];
            if(sl>sr){
                ans[n]=sl;
                left++;
            }else{
                ans[n]=sr;
                right--;
            }
            n--;
        }
        return ans;

        
    }
}