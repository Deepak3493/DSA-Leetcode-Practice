class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);
        for(int i= 0;i<nums.length;i++){
            if(nums[i]==0)
               nums[i] =-1;
            sum+=nums[i];
            if(!mp.containsKey(sum))
                mp.put(sum, i);
            
            ans = Math.max(ans, i- mp.get(sum));
        }
        return ans;
    }
}