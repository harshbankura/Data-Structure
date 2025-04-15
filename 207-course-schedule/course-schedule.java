class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            adj.get(pre[0]).add(pre[1]);
        }
        int[] ind= new int[n];
        for(int i=0;i<n;i++){
            for(int neigh:adj.get(i)){
                ind[neigh]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.offer(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            result.add(curr);
            for(int neigh:adj.get(curr)){
                ind[neigh]--;
                if(ind[neigh]==0){
                    q.offer(neigh);
                }
            }

        }
        
        return result.size()==n;


        
    }
}