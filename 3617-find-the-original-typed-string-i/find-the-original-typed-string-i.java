class Solution {
    public int possibleStringCount(String word) {
        int groupsWithRepeats = 0;
        int n = word.length();
        
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                    groupsWithRepeats++;
               
            }
        }
        
        return 1 + groupsWithRepeats;
        
    }
}