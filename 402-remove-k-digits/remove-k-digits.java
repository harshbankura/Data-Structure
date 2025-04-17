class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        for(char c : num.toCharArray()){
            while(!st.isEmpty()&&k>0&&c<st.peekLast()){
                st.pollLast();
                k--;
            }
            st.addLast(c);
        }
        while(k>0&& !st.isEmpty()){
            st.pollLast();
            k--;
        }
         StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : st) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
        
    }
}