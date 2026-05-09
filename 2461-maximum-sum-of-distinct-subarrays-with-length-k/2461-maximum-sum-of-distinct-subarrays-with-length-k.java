class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> st = new HashSet<>();
        long ans = 0;
        int i =0;
        int j = 0;
        long sum = 0;
        while(j<nums.length){
            int val = nums[j];
            while(st.contains(val) && i<j){
                st.remove(nums[i]);
                sum-=nums[i];
                i++; 
            }
            st.add(val);
            if(j-i<k){
               sum+=val; 
            }
            else{
                sum-=nums[i];
                if(st.contains(nums[i])){
                    st.remove(nums[i]);
                }
                sum+=nums[j];
                i++;
            }

            if(j-i+1==k)
               ans = Math.max(sum, ans);
        
            //System.out.println(i+" "+j+" "+sum+" "+ans);
            j++;
        }
        return ans;
    }
}