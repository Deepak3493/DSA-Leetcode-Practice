class Solution {
    public int totalFruit(int[] nums) {
        int ans = 0;
        int i =0;int j =0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(j<nums.length){
            int k = nums[j];
            mp.put(k,mp.getOrDefault(k,0)+1);
            while(mp.size()>2 && i<j){
                k = nums[i];
                if(mp.containsKey(k)){
                    if(mp.get(k)==1){
                        mp.remove(k);
                    }
                    else{
                        mp.put(k, mp.get(k)-1);
                    }
                }
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}