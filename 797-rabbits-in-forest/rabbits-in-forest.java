class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer>mp = new HashMap<>();
        int count=0;
        for(int answer:answers){
            if(answer==0){
                count+=1;
                continue;

            }
            if(mp.containsKey(answer)){
                mp.put(answer,mp.get(answer)-1);
                if(mp.get(answer)==0)mp.remove(answer);
            }else{
                mp.put(answer,answer);
                count+=answer+1;

            }
        }
        return count;
        
    }
}