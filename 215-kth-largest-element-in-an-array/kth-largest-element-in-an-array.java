class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
           count++;
           int num = pq.poll();
           if(count == k){
               return num;
           }
        }
        return -1;
    }
}