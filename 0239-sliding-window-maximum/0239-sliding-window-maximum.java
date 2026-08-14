class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0;
        int ans[] = new int[nums.length-k+1];
        Deque<Integer> q = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(q.size()>0 && q.peekFirst()<num){
                while(q.size()>0 && q.peekFirst()<num){
                    q.pollFirst();
                }
                q.addFirst(num);
            }
            else if(q.size()==0){
                q.addFirst(num);
            } 
            else{
                while(q.size()>0 && q.peekLast()<num){
                    q.pollLast();
                }
                q.addLast(num);
            }
            if(i<k){
                ans[0] = Math.max(ans[0],num);  
               continue;
            }
            int prevNum = nums[i-k];
            if(q.size()>0 && q.peekFirst()==prevNum){
                q.pollFirst();
            }
            ans[i-k+1] = q.size()>0 ? q.peekFirst():num;
        }
        return ans;
    }
}