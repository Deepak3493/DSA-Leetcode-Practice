class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(correctIndex<nums.length && correctIndex>=0 && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i]= nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(i = 0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}