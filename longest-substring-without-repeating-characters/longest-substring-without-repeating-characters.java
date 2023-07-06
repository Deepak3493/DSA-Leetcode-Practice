class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> st = new HashSet<>();
       int start = 0;
       int end = 0;
       int maxLength = 0;
       while(start<=end && end<s.length()){
        char ch = s.charAt(end);
        if(st.contains(ch)){
            while(st.contains(ch)){
                  st.remove(s.charAt(start));
                  start++;
            }
        }
        else{
            end++;
            st.add(ch);
        }
        maxLength = Math.max(maxLength,st.size());
       }
       return maxLength;
    }
}