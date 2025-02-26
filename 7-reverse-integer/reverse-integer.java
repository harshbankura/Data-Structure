class Solution {
    public int reverse(int x) {
        int reversed =0;
        while(x!=0){
            int digit=x%10;
            // check the constrains nowwwww only
            // ye samjna h madam seeeeeeee
             if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow case for negative numbers
            }


            reversed=(reversed*10)+digit;
            x=x/10;

        }
        return reversed;
        
    }
}