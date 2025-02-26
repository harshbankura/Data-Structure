class Solution {
    public int singleNumber(int[] nums) {
        int star=0;
        for(int i:nums){
            star=star^i;
        }
        return star;
        
    }
}