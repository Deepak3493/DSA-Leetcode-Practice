class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //k = k%nums.length;
        if(k==1 && nums.length ==1){
            return nums[0];
        }
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
        System.out.println(ans);
        return k!=0 ?(ans*1.0)/k:0;
    }
}