class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if((a==b)&&(b==c)){
            return new String("equilateral");
        }else if(((a==b)||(b==c))||(a==c)){
            if((a+b>c)&&(b+c>a)&&(a+c>b)){
                
            return new String("isosceles");

            }
        }else if((a+b>c)&&(b+c>a)&&(a+c>b)){
            return new String("scalene");
        }         
        
         return new String("none");
        
    }
}