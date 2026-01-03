class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 1;
        int max2 = 1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            max1 = max1*nums[i];
            ans = Math.max(ans,max1);
            if(max1==0){
                max1 = 1;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            max2 = max2*nums[i];
            ans = Math.max(ans,max2);
            if(max2==0){
                max2 = 1;
            }    
        }
        return ans;
    }
}