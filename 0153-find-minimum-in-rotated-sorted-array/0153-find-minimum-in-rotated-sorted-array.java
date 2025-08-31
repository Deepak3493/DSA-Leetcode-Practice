class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int startEle = nums[0];
        int ans = startEle;
        if(nums[0]<nums[end])
            return ans;
        while(start<end){
            int mid = (start+end)/2;
            int midEle = nums[mid];
            if(midEle>=startEle){
                start = mid+1;
                ans = nums[start];
            }
            else{
                end = mid;
            }
        }
        return ans;
    }
}