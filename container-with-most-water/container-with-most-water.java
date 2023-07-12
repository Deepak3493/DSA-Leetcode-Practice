class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n-1;
        int ans = 0;
        while(start<end){
            int ht = Math.min(height[start], height[end]);
            //System.out.println(height[start]+" "+height[end]);
            int wd = end-start; 
            ans = Math.max(ans, ht*wd);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }

        }
        return ans;

    }
}