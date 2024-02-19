class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> msubAns = new ArrayList<>();
            for(int j=0;j<i+1;j++){
               if(j==0 || j==i){
                  msubAns.add(1);
               }
               else{
                  msubAns.add(ans.get(i-1).get(j-1)+ ans.get(i-1).get(j));
               }
            }
            ans.add(msubAns);
        }
        return ans;
    }
}