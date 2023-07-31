class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        int floor = 0;
        int ceil = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>target){
                ceil = mid; 
                end = mid-1;
            }
            else if(nums[mid]<target){
                floor = mid;
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        if(floor==0 && ceil ==0){
            if(nums[floor]<target){
                return nums.length;
            }
            else{
                return 0;
            }
        }
        System.out.println(floor+" "+ceil);
        if(floor+1<nums.length && nums[floor]+1 != nums[floor+1])
           return floor+1;
        else{
            if(ceil>floor){
                return ceil;
            }
            else{
                return floor+1;
            }
        }
    }
}