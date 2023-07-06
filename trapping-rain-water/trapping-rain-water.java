class Solution {
    public int trap(int[] height) {
        int max = 0;
        int index = 0;
        for(int i = 0; i<height.length; i++){
            if(height[i]>max){
                max = height[i];
                index = i;
            }
        }

        int start = 1;
        max = height[0];
        int ans = 0;
        while(start<index){
           if(height[start]>=max){
               max = height[start];
           }else{
               ans = ans + max - height[start];
           }
           start++;
        }

        max = height[height.length-1];
        int end = height.length-2;
        while(end>index){
           if(height[end]>=max){
               max = height[end];
           }else{
               ans = ans + max - height[end];
           }
           end--;
        }
        return ans;
    }
}