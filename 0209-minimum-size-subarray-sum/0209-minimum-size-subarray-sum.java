class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start0 = 0;
        int start1 = 0;
        int end = nums.length;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        boolean isMatch = false;
        while(start1<end && start0<end){
            
            if(sum<target){
                sum = sum + nums[start1];
                start1++;
            }
         
            while(sum>=target && start0<=start1){
                int ans2 = start1 - start0;
                if(ans2>0 && ans2<ans){
                    ans = ans2;
                }
                sum = sum - nums[start0];
                start0++;
            }
               
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}