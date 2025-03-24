class Solution {
    public String frequencySort(String s) {
        // find freq using hashmap;
        // use PQ max heap to sort in highest form ;
        // pq.poll and add that in StringBuilder
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a,b)->map.get(b)-map.get(a)
        );
        maxHeap.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char curr = maxHeap.poll();
            for(int i=0;i<map.get(curr);i++){
                sb.append(curr);
            }




        }
            
        
        return sb.toString();
        
    }
}