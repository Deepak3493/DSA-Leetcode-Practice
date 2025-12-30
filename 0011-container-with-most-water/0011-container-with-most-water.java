class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int ans = 0;
        while(start<end){
            int left = height[start];
            int right = height[end];
            int area = Math.abs(end-start)*Math.min(left,right);
            ans = Math.max(ans, area);
            if(left<right){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;

    }
}