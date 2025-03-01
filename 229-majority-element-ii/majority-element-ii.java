class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =nums.length;
        int c1=0;
        int c2=0;
        int el1=0;
        int el2=0;
        for(int num:nums){
            if(num==el1){
                c1++;
            }
            else if(num==el2){
                c2++;
            }
            else if(c1==0){
                el1=num;
                c1++;
            }
            else if(c2==0){
                el2=num;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==el1){
                c1++;
            }
            else if(num==el2){
                c2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(c1>n/3) ans.add(el1);
        if (c2>n/3) ans.add(el2);
        return ans;
        
    }
}