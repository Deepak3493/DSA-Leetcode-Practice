class Solution {
    public int trap(int[] height) {
        int maxLeft = height[0];
        int maxRight = height[0];
        int indOfMaxRight = 0;
        int ans = 0;
        for(int i=1;i<height.length;i++){
            if(maxRight<height[i]){
               indOfMaxRight = i;
               maxRight = height[i];
            }
        }
        for(int i=1;i<indOfMaxRight;i++){
           int k = height[i];
           if(k<maxLeft && k<maxRight){
              ans += (Math.min(maxRight,maxLeft) - k);
           }
           maxLeft = Math.max(maxLeft, k);
        }
        maxLeft = height[height.length-1];
        for(int i=height.length-2;i>indOfMaxRight;i--){
           int k = height[i];
           if(k<maxLeft && k<maxRight){
              ans += (Math.min(maxRight,maxLeft) - k);
           }
           maxLeft = Math.max(maxLeft, k);
        }
        return ans;
    }
}