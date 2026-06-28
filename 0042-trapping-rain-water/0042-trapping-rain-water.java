class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int left = 0;
        int right = size-1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(left<right){
            int leftBlock = height[left];
            int rightBlock = height[right];
            if(leftBlock<rightBlock){
                if(leftMax > leftBlock){
                   total += leftMax - leftBlock;
                }
                leftMax = Math.max(leftMax, leftBlock);
                left++;
            }
            else{
                if(rightMax > rightBlock){
                   total += rightMax - rightBlock;
                }
                rightMax = Math.max(rightMax, rightBlock);
                right--;
            }
        }
        return total;
    }
}