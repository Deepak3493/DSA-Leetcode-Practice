class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        findAns(candidates, 0,target, subAns, ans);
        return ans;
    }
    public static void findAns(int[] candidates, int ind, int target, List<Integer> subAns,
    List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(subAns));
            return;
        }
        if(target<0 || ind>=candidates.length){
            return;
        }
        
        subAns.add(candidates[ind]);
        findAns(candidates, ind,target-candidates[ind],subAns, ans);
        subAns.remove(subAns.size()-1);
        findAns(candidates, ind+1,target,subAns, ans);
    
    }
}