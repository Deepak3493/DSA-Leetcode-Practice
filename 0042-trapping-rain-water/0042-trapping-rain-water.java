class Solution {
    public int trap(int[] height) {
        int maxHeightIndex = 0;
        for(int i = 0;i<height.length;i++){
            int k = height[i];
            if(height[maxHeightIndex]<k){
                maxHeightIndex = i;
            }
        }
        int ans = 0;
        int left = 0;
        int leftMax = 0;
        while(left<maxHeightIndex){
            int k = height[left];
            if(leftMax > k){
                ans+= (leftMax - k);
            }
            leftMax = Math.max(leftMax, k); 
            left++;
        }
        System.out.println(ans);
        int rightMax = 0 ;;
        int right = height.length-1;
        while(maxHeightIndex< right){
            int k = height[right];
            if(rightMax > k){
                ans+= (rightMax - k);

            }
            rightMax = Math.max(rightMax, k); 
            right--;
        }
        return ans;

    }
}