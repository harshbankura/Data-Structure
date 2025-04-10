class Solution {
    public int myAtoi(String s) {
        if(s==null||s.length()==0)return 0;
        int index=0;
        int sign=1;
        int n=s.length();
        int result=0;
        while(index<n&&s.charAt(index)==' '){
            index++;
        }
        if(index<n&& (s.charAt(index)=='-'||s.charAt(index)=='+')){
            sign=s.charAt(index)=='-'?-1:1;
            index++;
        }
        while(index<n && Character.isDigit(s.charAt(index))){
            int ans= s.charAt(index)-'0';
            // 32 bit condition min max;
            if (result > (Integer.MAX_VALUE - ans) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            // end
            result=result*10+ans;
            index++;

        }
        return result*sign;
        
    }
}