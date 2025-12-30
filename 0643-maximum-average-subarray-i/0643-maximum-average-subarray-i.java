class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(i>=k){
                sum -= nums[i-k];
                ans = Math.max(sum, ans);
            }
            else if(i==(k-1)){
                ans = Math.max(sum, ans);
            }
            
        }
        return k!=0 ?(ans*1.0)/k:0;
    }
}