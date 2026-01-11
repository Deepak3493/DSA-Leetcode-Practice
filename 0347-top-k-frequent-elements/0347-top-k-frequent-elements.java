class Solution {
    // static class Pair{
    //     int 
    // }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(mp.containsKey(num)){
                int count = mp.get(num);
                max = Math.max(count+1,max);
                mp.put(num, count+1);
            }
            else{
                mp.put(num,1);
            }
        }

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );
        int i = 0;
        for(int num :mp.keySet()){
            if(i<k){
                pq.add(new Pair<>(num, mp.get(num)));
            }
            else{
                if(pq.peek().getValue()<mp.get(num)){
                    pq.poll();
                    pq.add(new Pair<>(num, mp.get(num)));
                }
            }
                    //System.out.println(pq.toString());

            i++;
        }
        // System.out.println(pq.toString());
        int ans [] = new int[k];
        for(i=0;i<k;i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    
    }
}