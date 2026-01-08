class Solution {
    public int longestOnes(int[] nums, int k) {
        int count1=0;
        int count0 = 0;
        int left = 0;
        int right =0;
        int ans =0;
        while(right<nums.length){
            if(nums[right]==1){
                count1++;
            }
            else{
                count0++;
            }
            while(count0>k){
                if(nums[left]==0){
                    count0--;
                }
                else{
                    count1--;
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}