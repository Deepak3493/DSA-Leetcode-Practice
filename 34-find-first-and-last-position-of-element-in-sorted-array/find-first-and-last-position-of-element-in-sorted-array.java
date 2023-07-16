class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = -1;
        int lastPos = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
           int mid = (start+end)/2;
           int k = nums[mid];
           if(k>target){
               end = mid-1;
           }
           else if(k<target){
               start = mid+1;
           }
           else{
               firstPos = mid;
               end = mid-1;
           }
        }

        start = 0;
        end = nums.length-1;
        while(start<=end){
           int mid = (start+end)/2;
           int k = nums[mid];
           if(k>target){
               end = mid-1;
           }
           else if(k<target){
               start = mid+1;
           }
           else{
               lastPos = mid;
               start = mid+1;
           }
        }
        return new int[]{firstPos, lastPos};
    }
}