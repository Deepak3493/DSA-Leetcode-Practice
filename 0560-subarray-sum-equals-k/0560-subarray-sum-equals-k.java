class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> mp = new HashMap<>();
       int sum = 0;
       mp.put(0,1);
       int countOfSumKSubArrays = 0;
       for(int i=0;i<nums.length;i++){
          sum = sum+nums[i];
          if(mp.containsKey(sum-k)){
           countOfSumKSubArrays += mp.get(sum-k);
          }
          mp.put(sum, mp.getOrDefault(sum,0)+1);
       }
       return countOfSumKSubArrays;
    }
}