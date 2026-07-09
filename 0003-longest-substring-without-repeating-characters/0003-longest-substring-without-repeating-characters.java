class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i=0;
      int j=0;
      int size = s.length();
      HashSet<Character> st = new HashSet<>();
      int ans = 0;
      while(j<size){
        char ch1 = s.charAt(j);
        while(st.contains(ch1)){
            char ch2 = s.charAt(i);
            st.remove(ch2);
            i++;
        }
        st.add(ch1);
        ans = Math.max(ans, st.size());
        j++;
      }
      return ans;
    }
}