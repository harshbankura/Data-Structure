class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            int length=0;
            if(!set.contains(num-1)){
                int curr=num;
                 length=1;
                while(set.contains(curr+1)){
                    length++;
                    curr=curr+1;
                    }

                
                max=Math.max(max,length);
            }
           
        }
        return max;
        
    }
}