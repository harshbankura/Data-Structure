class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                int temp1=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp1;
                high--;
                
                break;

            }
        }
        
    }
}