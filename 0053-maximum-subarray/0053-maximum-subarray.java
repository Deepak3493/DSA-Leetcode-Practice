class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>nums[i]){
                sum = sum+nums[i];
            }
            else{
                sum = nums[i];
            }
            if(ans<sum){
                ans = sum;
            }
        }
        return ans;
    }
}