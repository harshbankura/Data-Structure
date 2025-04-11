class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet= new HashSet<>(wordList);
        if(!wordSet.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int op=1;
        while(!q.isEmpty()){
            int n= q.size();
            for(int i=0;i<n;i++){
                
            String curr=q.poll();
            char[] words= curr.toCharArray();
            for(int j=0;j<words.length;j++){
                char num=words[j];
                for(char c='a';c<='z';c++){
                    words[j]=c;
                    String newWord = new String(words);
                    
                    if (newWord.equals(endWord)) return op + 1;
                    if(wordSet.contains(newWord)){
                         q.offer(newWord);
                            wordSet.remove(newWord); 
                    }
                   
                }
                
                    words[j] = num;

            }
            }
            op++;
        }
        return 0;
    }
}