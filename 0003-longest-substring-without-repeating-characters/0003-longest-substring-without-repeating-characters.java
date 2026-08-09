class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0;
       int j = 0;
       HashSet<Character> st = new HashSet<>();
       int ans = 0;
       while(j<s.length()){
            char ch = s.charAt(j);
            while(st.contains(ch) && i<j){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(ch);
            ans = Math.max(ans, st.size());
            j++;
       }
       return ans; 
    }
}