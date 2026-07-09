class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid > 0 && nums[mid] > nums[mid-1] && 
                               mid < nums.length-1 && nums[mid] > nums[mid+1]){
                    ans = mid;
                    break;
            }
            else if( mid>0 && nums[mid]<nums[mid-1]){
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}