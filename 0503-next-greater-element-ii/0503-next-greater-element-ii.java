class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums.length];
        int n = nums.length;
        for(int i = 2*n-1;i>=0;i--){
            int k = nums[i%n];
            while(st.size()>0 && st.peek()<=k){
                st.pop();
            }
            if(i<n){
                  ans[i%n] = st.size()>0 ? st.peek(): -1;
            }
            st.push(k);
        }
        return ans;
    }
}