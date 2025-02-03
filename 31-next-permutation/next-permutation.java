class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){ //first decreasing element
            i--;
        }
        if(i>=0){
            int k=n-1; //largest 
            while(nums[k]<=nums[i]){
                k--;
            }
            swap(nums,k,i);
        }
        
            sort(nums,i+1,n-1);
            
            }
            private void swap(int arr[],int left, int right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            private void sort(int arr[], int start,int end){
                while(start<end){
                    swap(arr,start,end);
                    start++;
                    end--;
                }
            }
}
        
    
