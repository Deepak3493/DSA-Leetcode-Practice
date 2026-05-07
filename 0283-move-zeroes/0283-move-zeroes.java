class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i<=j && j<nums.length){
            int l = nums[j];
            if(l!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}