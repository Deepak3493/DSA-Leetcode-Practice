class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int pivot = 0;
        while(start<end){
            int mid = start+(end-start)/2;
            int num = nums[mid];
            if(nums[mid]>= nums[0] && nums[mid]<nums[mid+1]){
                start = mid+1;
                pivot = start;
            }
            else{
                end = mid;
            }
        }
        
        if(target>=nums[0] && target<=nums[pivot]){
            return binarySearch(nums, target, 0, pivot);
        }
        else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }
    public static int binarySearch(int nums[], int target, int start ,int end){
        System.out.println(start+" "+end);
        while(start<=end){
            int mid = start+(end-start)/2;
            int num = nums[mid];
            if(num<target){
                start = mid+1;
            }
            else if(num==target){
                return mid;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}