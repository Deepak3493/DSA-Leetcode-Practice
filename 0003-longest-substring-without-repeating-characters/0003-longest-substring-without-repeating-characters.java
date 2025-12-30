class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        HashSet<Character> st = new HashSet<>();
        int ans = 0;
        while((end<s.length() && start<s.length())){
            char ch = s.charAt(end);
            while(st.contains(ch) && start<=end){
                st.remove(s.charAt(start));
                start++;
            }
            st.add(ch);
            ans = Math.max(ans, st.size());
            end++;
        }
        return ans;
    }
}