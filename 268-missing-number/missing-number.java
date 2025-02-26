class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum= n*(n+1)/2;
        int main=0;
        for(int i : nums){
            main=main+i;

        }
        return sum-main;
        
    }
}