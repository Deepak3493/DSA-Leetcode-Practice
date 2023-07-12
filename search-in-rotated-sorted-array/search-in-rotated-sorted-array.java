class Solution {
    public int search(int[] nums, int target) {
        if(nums[0]<=nums[nums.length-1]){
            return search(nums, 0, nums.length-1, target);
        }
        int pivot = findPivot(nums);
        System.out.println(pivot);
        if(target>=nums[0] && target<=nums[pivot-1]){
            return search(nums,0,pivot-1, target);
        }
        else{
            return search(nums,pivot, nums.length-1, target);
        }
    }

    public static int findPivot(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
           int mid =(start+end)/2;
           if(nums[0]<=nums[mid]){
                start = start+1;
           }
           else{
               end = mid;
           }
        }
        return start;
    }
    public static int search(int nums[], int start, int end, int target){
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

}