class Solution {
    public int largestRectangleArea(int[] heights) {
        int nse[] = nse(heights);
        int pse[] = pse(heights);
        // for(int i=0;i<heights.length;i++){ System.out.print(nse[i]+" "); };
        // System.out.println();
        // for(int i=0;i<heights.length;i++){ System.out.print(pse[i]+" "); };

        int area = 0;
        for(int i=0;i<heights.length;i++){
            int height = heights[i];
            int areaToBe = heights[i] * (nse[i]-pse[i]-1);
            // System.out.println(i+" "+height+" "
            //          +nse[i]+" "+ pse[i]+ " " + areaToBe);
            area = Math.max(area, areaToBe);
        }
        return area;
    }
    public static int[] nse(int [] heights){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[heights.length];
        for(int i = heights.length-1;i>=0;i--){
            int k = heights[i];
            while(!st.isEmpty() && heights[st.peek()]>=k){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : heights.length;
            st.add(i);

        }
        return ans;

    }
    public static int[] pse(int [] heights){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            int k = heights[i];
            while(!st.isEmpty() && heights[st.peek()]>=k){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.add(i);
        }
        return ans;
    }
}