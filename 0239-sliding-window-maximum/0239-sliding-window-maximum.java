class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> q = new ArrayDeque<>(); 
       int ans[] = new int[nums.length-k+1];
       int j = 0; 
       for(int i = 0;i<nums.length;i++){
            if(i>k-1 && q.size()>0 && q.peekFirst()== i-k){
                q.pollFirst();
            }
            int num = nums[i];
            while(q.size()>0 && nums[q.peekFirst()]<num){
                q.pollFirst();
            }
            if(q.size()== 0 || nums[q.peekFirst()]<num){
                q.addFirst(i);
            }else{
                 while(q.size()>0 && nums[q.peekLast()]<num){
                    q.pollLast();
                 }
                 q.addLast(i);
            }
            if(i>=k-1){
                ans[j++] = nums[q.peekFirst()];
            }  
       } 
       return ans;
    }
}