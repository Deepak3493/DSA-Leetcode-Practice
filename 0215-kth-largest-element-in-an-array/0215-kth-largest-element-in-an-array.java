class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(i<k){
                pq.add(num);
            }
            else{
                if(pq.peek()<num){
                    pq.poll();
                    pq.add(num);
                }
            }
        }
        return pq.peek();
    }
}