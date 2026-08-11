class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<=n;i++){
            ans = ans^i;
            if(i==n){
                continue;
            }
            ans = ans^nums[i];
        }
        return ans;
    }
}