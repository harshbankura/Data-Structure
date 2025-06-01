class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=-1;
        for(int i:nums){
            if(count==0){
                majority=i;
            }
            count+=(i==majority)?1:-1;
        }
        count=0;
        for(int j:nums){
            if(j==majority){
                count++;
            }
        }
        return (count>nums.length/2)?majority:-1;
        
    }
}