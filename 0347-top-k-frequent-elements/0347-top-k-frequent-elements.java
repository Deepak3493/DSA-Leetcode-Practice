class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.count - b.count);
        int size = nums.length;
        int i = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(i<size){
            int key = nums[i];
            int val = 1;
            if(mp.containsKey(key)){
                val += mp.get(key);
            }
            mp.put(key, val);
            i++;
        }
        for(int key : mp.keySet()){
            int val = mp.get(key);
            if(q.size()<k){
                q.add(new Pair(key, val));
            }
            else if(q.size()>=k && q.peek().count < val){
                q.poll();
                q.add(new Pair(key, val));
            }
        }
        int ans[] = new int[k];
        int j=0;
        while(q.size()>0){
            ans[j++] = q.poll().key;
        }
        return ans;
    }
    class Pair{
        int key;
        int count;
        Pair(int key, int count){
            this.key = key;
            this.count = count;
        }
    }
}