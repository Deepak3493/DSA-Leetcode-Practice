class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
       int i = 0;
       while(i<tokens.length){
            if(tokens[i].equals("+")){            
                int second  = st.pop();
                int first = st.pop();
                st.push(first+second);
            }
            else if(tokens[i].equals("/")){
                int second  = st.pop();
                int first = st.pop();
                st.push(first/second);
            }
            else if(tokens[i].equals("*")){
                int second  = st.pop();
                int first = st.pop();
                st.push(first*second);
            }
            else if(tokens[i].equals("-")){
                int second  = st.pop();
                int first = st.pop();
                st.push(first-second);
            }
            else{
                st.add(Integer.parseInt(tokens[i]));
            }
       
        i++;
       } 
       return st.pop();
    }
}