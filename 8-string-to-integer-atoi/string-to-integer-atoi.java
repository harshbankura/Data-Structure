class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        long result=0;
        int sign=1;
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;


        }
        while(i<n&&Character.isDigit(s.charAt(i))){
            int num=s.charAt(i)-'0';
            result=result*10 +num;
            // Step 4: Clamp if out of int range
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)result*sign;
    }
}