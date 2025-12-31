class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int ans = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum == k){
                ans+=1;
            }
            if(mp.containsKey(prefixSum-k)){
                ans+=mp.get(prefixSum-k);
            }
            mp.put(prefixSum,mp.getOrDefault(prefixSum,0)+1);
        }
        return ans;
    }
}