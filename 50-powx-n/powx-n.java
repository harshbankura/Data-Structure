class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long ex=Math.abs((long)n);
        while (ex > 0) {
            if (ex % 2 == 1) {
                ans *= x;
            }
            x *= x;
            ex /= 2;
        }
        if(n<0){
            ans=1/ans;
        }
        return ans;
        
    }
}