class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int low=1;
        int high=0;
        
        for(int bloom:bloomDay){
            high=Math.max(bloom,high);
            }
        

        while(low<high){
            int mid=low+(high-low)/2;
            if(done(bloomDay,m,k,mid)){
                
                high=mid;
                
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    private boolean done(int[] bloomDay,int m, int k, int mid ){
        int flower=0;
        int bou=0;
        for(int bloom:bloomDay){
            if(bloom<=mid){
                flower++;
                if(flower==k){
                    bou++;
                    flower=0;
                }
            }else{
                flower=0;
            }
        }
        return (bou>=m);
    }
}