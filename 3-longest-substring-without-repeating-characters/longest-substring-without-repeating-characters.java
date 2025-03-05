class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int left=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char curr= s.charAt(r);
            
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            max=Math.max(max,r-left+1);
        }
        return max;

        
    }
}