class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        generateParenthesis(0, 0, n, "", ans);
        return ans;
    }
     public void generateParenthesis(int open, int closed,int total, String ansStr, List<String> ans) {
           //System.out.println(ansStr+" "+open+" "+closed);
           if(open+closed>2*total){
               return;
           }
           if(closed>open){
               return;
           }
           if(open+closed == 2*total && open == closed){
               ans.add(ansStr);
               return;
           }
           generateParenthesis(open, closed+1, total, ansStr+")", ans);
           if(closed<=open){
                
                generateParenthesis(open+1, closed, total, ansStr+"(", ans);
           }

     }
}