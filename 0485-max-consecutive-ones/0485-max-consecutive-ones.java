class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int i = 0;
        int j = 0;
        int ans = 0;
        // while(j<nums.length){
        //    int k = nums[j];
        //    if(k==0){
        //      ans = Math.max(ans, j-i-1);
        //      j++;
        //      i=j;
        //    }
        //    else{
        //      ans = Math.max(ans, j-i+1);
        //      j++;
        //    }

        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans = Math.max(ans, i-j+1);
            }
            else{
                j=i+1;
            }
        }
        return ans;
    }
}