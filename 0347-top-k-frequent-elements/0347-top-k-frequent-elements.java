class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
            (n1,n2) -> mp.get(n1) - mp.get(n2)
        );

        for(int key: mp.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int result [] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll();
        }
        return result;

    }
}