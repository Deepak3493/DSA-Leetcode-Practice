class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int maxsoFar = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
              if(i!=nums.length-1 && nums[i]>nums[i+1]){
                   count++;
                    if(maxsoFar> nums[i+1])
                        nums[i+1] = nums[i];
                    else
                        nums[i] = nums[i+1];
                   continue;
              }
              if(nums[i]<maxsoFar){
                  return false;
              }
              maxsoFar = Math.max(maxsoFar,nums[i]);
        }
        return count <= 1;
    }
}