class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int length = nums.length;
        int result [] = new int[length-k+1];
        int ind = 0;
        for(int i=0;i<length;i++){
            int num = nums[i];

            while(q.size()>0 && q.peekFirst()<=i-k){
                q.pollFirst();
            }

            while(q.size()>0 && nums[q.peekLast()] <= num){
                q.pollLast();
            }
         
            q.addLast(i);

            if(i>=k-1){
                result[ind++] = nums[q.peekFirst()];
            }
        }
        return result;
    }
}