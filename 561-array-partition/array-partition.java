import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            ans=ans+nums[i];
            i++;

        }
        return ans;

        
    }
}