class Solution {
    public double myPow(double x, int n) {
        long N = Math.abs((long)n);
        double ans=1;
        while(N>0){
            if(N%2==1){
                ans*=x;
            }
            x*=x;
            N/=2;
        }
        if(n<0){
            return 1/ans;
        }
        return ans;
        
    }
}