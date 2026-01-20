
class Solution {
    public int maxProduct(int[] nums) {
        int a = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            a = a*k;
            if(a==0){
                a = k;
            }
            ans = Math.max(a,ans);

        }
        a = 1;
        for(int i=nums.length-1;i>=0;i--){
            int k = nums[i];
            a = a*k;
            if(a==0){
                a = k;
            }
            ans = Math.max(a,ans);

        }
        return ans;
    }
}