class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> st = new ArrayDeque<Integer>();  
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int c=0;
        for(int i=0;i<n;i++){
           int num = nums[i];
            
            while(st.size()>0 && st.peekLast()<num){
                //System.out.println("peekLast "+st.peekLast()+" num "+num);
                st.pollLast();
            }
            st.addLast(num);

            if(i>=(k-1)){
                
                ans[c++]=st.peekFirst();
                int elementTobeRemoved = nums[i-k+1];
                if(st.peekFirst()== elementTobeRemoved){
                   st.pollFirst();
                }
            }
            
        }return ans;
    }
}