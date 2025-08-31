class Solution {
    public int search(int[] nums, int target) {
        int pivot = findMin(nums);
        System.out.println(pivot);
        if(pivot !=0 && target>=nums[0] && target<=nums[pivot-1]){
            return find(nums, 0,pivot, target);
        }
        else{
            return find(nums,pivot,nums.length-1, target);
        }
    }
    public int find(int nums[], int start, int end, int target){
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

     public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int startEle = nums[0];
        int ans = startEle;
        int ind = 0;
        if(nums[0]<=nums[end])
            return ans;
        while(start<end){
            int mid = (start+end)/2;
            int midEle = nums[mid];
            if(midEle>=startEle){
                start = mid+1;
                ans = nums[start];
                ind = start;
            }
            else{
                end = mid;
            }
        }
        return ind;
    }
}