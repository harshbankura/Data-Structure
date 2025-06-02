class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int e1=0;
        int e2=0,c1=0,c2=0;
        for(int num:nums){
            if(e1==num){
                c1++;
            }else if(e2==num){
                c2++;
            }else if(c1==0){
                e1=num;
                c1++;
            }else if(c2==0){
                e2=num;
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        // verify
        List<Integer> ans = new ArrayList<>();
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==e1){
                c1++;

            }else if(num==e2) c2++;

        }
        if(c1>n/3) ans.add(e1);
        if(c2>n/3) ans.add(e2);
        return ans;
        
    }
}