class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(weight,low);
            high+=weight;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(work(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    private boolean work(int[] weights,int days,int mid){
        int day=1;
        int load=0;
        for(int weight:weights){
            if(load+weight>mid){
                day++;
                load=weight;
            }else{
                load+=weight;
            }
        }
        return day<=days;
    }
}