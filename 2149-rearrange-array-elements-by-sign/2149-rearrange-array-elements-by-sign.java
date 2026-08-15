class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=0;
        int ans[] = new int[nums.length];
        int k=0;
        while(i<nums.length && j<nums.length){
            while(j<nums.length && nums[j]<0){
                 j++;
            }
            while(i<nums.length && nums[i]>0){
                 i++;
            }
           
            ans[k++] = nums[j++];
            ans[k++] = nums[i++];
        }
        // while(j<nums.length){
        //         ans[k++] = nums[j++];
        //         j++;
        // }
        // while(i<nums.length){
        //         ans[k++] = nums[i++];
        //         i++;
        // }
        return ans;

    }
}