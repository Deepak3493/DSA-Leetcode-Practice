class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int ans [] = new int[k];
        for(int i=0;i<nums.length;i++){
            int nm = nums[i];
            mp.put(nm,mp.getOrDefault(nm,0)+1);
        }

        Map<Integer,List<Integer>> mp2 = new TreeMap<>(Collections.reverseOrder());
        for(int key: mp.keySet()){
            int nm = mp.get(key);
            if(mp2.containsKey(nm)){
                List<Integer> val = mp2.get(nm);
                val.add(key);
            }
            else{
                List<Integer> val = new ArrayList<>();
                val.add(key);
                mp2.put(nm, val);
            }
        }
        int count =0;
        for(int key : mp2.keySet()){
            List<Integer> lst = mp2.get(key);
            for(int i=0;i<lst.size();i++){
                if(count>=k){
                    return ans;
                }
                ans[count] =lst.get(i);
                count++;
            }
        }
        return ans;
    }
}