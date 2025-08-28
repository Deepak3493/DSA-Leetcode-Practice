class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            if(st.contains(k)){
                return true;
            }
            else{
               st.add(k);
            }
        }
        return false;
    }
}