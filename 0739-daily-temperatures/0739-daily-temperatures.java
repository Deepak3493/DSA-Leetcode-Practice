class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans [] = new int[temperatures.length];
        int size = temperatures.length;
        Stack<Pair> st = new Stack<>();
        for(int i= size-1;i>=0;i--){
            int k = temperatures[i];
            while(st.size()>0 && st.peek().val<=k){
                st.pop();
            }
            ans[i] = st.size()>0 ? st.peek().ind - i : 0;
            st.push(new Pair(k, i));
        }
        return ans;
    }
    class Pair{
        int val;
        int ind;
        Pair(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
}