class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
        
    }
    private void swap(int nums[],int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    private void reverse(int nums[],int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}