class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=high;
        while(low<=high){
            int mid = low + (high - low) / 2;

            long max=maxT(piles,mid);
           
            if(max>h){
                low=mid+1;

            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
        
    }
    private long maxT(int[] piles,int mid){
        long time=0;
        for(int pile:piles){
            time=time+(pile+mid-1)/mid;
             if (time > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return time;
    }
    private int max(int[] piles){
        int max=0;
        for(int pile:piles){
            max=Math.max(max,pile);

        }
        return max;
    }
}