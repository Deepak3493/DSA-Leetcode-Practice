class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int ans = 0;
        while(left<right){
            int leftH = height[left];
            int rightH = height[right];
            int area = Math.min(leftH, rightH)*(right-left);
            ans = Math.max(ans, area);
            if(leftH<rightH)
                left++;
            else
                right--;
        }
        return ans;
    }
}