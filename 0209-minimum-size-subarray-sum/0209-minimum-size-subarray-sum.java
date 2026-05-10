class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(j<nums.length){
            int k = nums[j];
            sum+=k;
            while(sum>target){
                ans = Math.min(ans, j-i+1);
                sum -= nums[i];
                i++;
            }
            if(sum == target){
                 ans = Math.min(ans, j-i+1);
            }
          
            //System.out.println(i+" "+j+" "+sum+" "+ans);
            j++;

        }
        if(ans == Integer.MAX_VALUE)
            ans = 0;
        return ans;
    }
}