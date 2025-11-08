class Solution {
    private String[] MOSRE_TABLE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word: words) {
            set.add(getMorseCode(word));
        }
        return set.size();
    }

    private String getMorseCode(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch: word.toCharArray()) {
            sb.append(MOSRE_TABLE[ch-'a']);
        }
        return sb.toString();
    }
}