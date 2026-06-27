class Solution {
    public boolean isValid(String s) {
        Stack<Character> st  = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(')
              st.add(')'); 
            else if(ch =='{')
              st.add('}'); 
            else if(ch =='[')
              st.add(']'); 
            else if(st.size()== 0 || st.pop() != ch ) 
                 return false;
        }
            return st.size()==0;
    }
}