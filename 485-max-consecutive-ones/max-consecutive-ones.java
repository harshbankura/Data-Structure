class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int curr=0;
        for(int i:nums){
            if(i==1){
                curr++;
                max=Math.max(max,curr);
            }
            else{
                curr=0;
            }
        }
        return max;
        
    }
}