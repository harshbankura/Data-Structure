class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>> rg = new ArrayList<>();
        int[] ind = new int[n];
        for(int i=0;i<n;i++){
            rg.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int edge:graph[i]){
                rg.get(edge).add(i);
                ind[i]++;

            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.offer(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            result.add(curr);
            for(int edge:rg.get(curr)){
                ind[edge]--;
                if(ind[edge]==0){
                    q.offer(edge);
                }
            }
        }
        Collections.sort(result);
        return result;
        
    }
}