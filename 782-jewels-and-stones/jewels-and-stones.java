class Solution {
    public int numJewelsInStones(String J, String S) {
         boolean[] map = new boolean[256];
        for (char c: J.toCharArray()) {
            map[c] = true;
        }
        int res = 0;
        for (char c: S.toCharArray()) {
            if (map[c]) res++;
        }
        return res;
        
    }
}