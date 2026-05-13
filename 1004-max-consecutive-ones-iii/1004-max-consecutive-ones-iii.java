class Solution {
    public int longestOnes(int[] nums, int k) {
        int count0 =0;
        int j=0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(count0<=k && num ==0){
                count0++;
            }
            while(j<=i && count0>k){
                if(nums[j]==0){
                    count0--;
                }
                j++;
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}