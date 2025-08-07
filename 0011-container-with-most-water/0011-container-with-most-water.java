class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans  = Integer.MIN_VALUE;
        while(left<right){
            int a = height[left];
            int b = height[right];
            int area = Math.min(a,b)*(right-left);
            ans = Math.max(area, ans);
            if(a<b){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}