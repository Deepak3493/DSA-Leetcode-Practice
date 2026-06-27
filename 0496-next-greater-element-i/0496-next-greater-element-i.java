class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int k = nums2[i];
            while(st.size()>0 && st.peek()<=k){
                st.pop();
            }
            mp.put(k, st.size()>0 ? st.peek():-1);
            st.add(k);
           // System.out.println(nums[k-1]);
        }
        for(int i=0;i<nums1.length;i++){
            int k  = nums1[i];
            nums1[i] = mp.get(k);
        }
        return nums1;
    
    }
}