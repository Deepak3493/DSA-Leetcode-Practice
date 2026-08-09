class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        HashSet<Integer> st = new HashSet<>();
        for(int i: nums){
           st.add(i);
        }
        
        for(int i: nums){
           if(!st.contains(i-1)){
              mp.put(i,true);
           }
        }
        int ans = 0;
        for(Integer key: mp.keySet()){
            if(mp.get(key)){
                int count = 1;
                key++;
                while(st.contains(key++)){
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;

    }
}