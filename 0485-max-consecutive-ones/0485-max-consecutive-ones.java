class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<nums.length){
           int k = nums[j];
           if(k==0){
             ans = Math.max(ans, j-i-1);
             j++;
             i=j;
           }
           else{
             ans = Math.max(ans, j-i+1);
             j++;
           }

        }
        return ans;
    }
}