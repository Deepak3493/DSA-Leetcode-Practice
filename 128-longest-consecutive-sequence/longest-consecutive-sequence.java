class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
          return 0;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        HashMap<Integer,Boolean> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            if(!st.contains(k-1)){
                mp.put(k,true);
            }
            else{
                mp.put(k,false);
            }
        }
        //System.out.println(mp.toString());
        int ans = 1;
        for(Integer k : mp.keySet()){
            int count = 0;
            if(mp.get(k)){
                while(st.contains(k)){
                    count++;
                    k++;
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}