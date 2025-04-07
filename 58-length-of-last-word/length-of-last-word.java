class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        for(char ch:s.toCharArray()){
            count++;
            if(ch==' '){
                count=0;
            }
            
        }
        return count;
        
    }
}