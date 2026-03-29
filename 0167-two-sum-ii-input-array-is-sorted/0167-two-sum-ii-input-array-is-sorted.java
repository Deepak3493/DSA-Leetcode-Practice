class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int k = numbers[i];
            if(mp.containsKey(target-k)){
                return new int[]{mp.get(target-k), i+1};
            }
            mp.put(k, i+1);
        }
        return new int[]{-1,-1};
        
    }
}