class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int num = nums[0];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i] = num;
            num = num*nums[i];
        }
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(ans[i]);
        // }
        int k = nums[nums.length-1];
        for(int i= nums.length-2;i>=0;i--){
           ans[i] = k*ans[i];
           k = k*nums[i];
        }
        return ans;
    }
}