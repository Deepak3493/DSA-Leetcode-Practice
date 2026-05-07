class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int area = 0;
        while(i<j){
           int a = height[i];
           int b = height[j];
           int minH = Math.min(a,b);
           int dist = j-i;
           area = Math.max(area, minH*dist);
           if(a>b){
            j--;
           }
           else{i++;}
        }
        return area;
    }
}