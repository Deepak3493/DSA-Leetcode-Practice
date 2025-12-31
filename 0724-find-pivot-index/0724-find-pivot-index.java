class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int num: nums){
            totalsum+=num;
        }
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
          
            totalsum -= nums[i];
            if(leftSum == totalsum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;

    }
}