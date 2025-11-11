class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int ans = 0;
        int start = 0;
        int end = 0;
        int stringLen = s.length();
        while(end<stringLen){
            char ch = s.charAt(end);
            while(st.contains(ch) && start<end){
                st.remove(s.charAt(start));
                start++;
            }
            st.add(ch);
            end++;
            ans = Math.max(ans, st.size());
        }
        return ans;

    }
}