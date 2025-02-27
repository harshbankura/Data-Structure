class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                el=num;
            }
            count+=(el==num)?1:-1;
        }
        return el;
        
    }
}