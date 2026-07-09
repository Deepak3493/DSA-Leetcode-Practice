class Solution {
    public int search(int[] nums, int target) {
       int pivot =0;
       int start =0;
       int end = nums.length-1;
       while(start<end){
        int mid = (start+end)/2;
        if(nums[mid]>=nums[0]){
            start = mid+1;
            pivot = mid;
        }
        else{
            end = mid;
        }
       }
       //return pivot;

       if(target >= nums[0] &&  target <= nums[pivot]){
          return find(nums,0, pivot , target) ;
        
       }
       else{
          return find(nums, pivot+1, nums.length-1, target);
       }
    }
    public static int find(int nums[], int start, int end, int target){
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}