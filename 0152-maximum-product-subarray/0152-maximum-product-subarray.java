class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int result = max;
        for(int i = 1;i<nums.length;i++){
            int k = nums[i];
            int prevMin = min;
            min = Math.min(k, Math.min(prevMin*k, max*k));
            max = Math.max(k, Math.max(prevMin*k, max*k));
            result = Math.max(result, max);
        }
        return result;
    }
}