class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        findAns(candidates, target, 0, ans, subAns);
        return ans;
    }
    public static void findAns(int candidates[], int target, int x,List<List<Integer>>ans, List<Integer> subAns){
        if(target == 0){
            List<Integer> subAnsCopy = new ArrayList<>();
            for(int num :subAns){
                subAnsCopy.add(num);
            }
            ans.add(subAnsCopy);
            return ;
        }
        if(target<0){
            return ;
        }
        for(int i = x;i<candidates.length;i++){
            if(i>x && candidates[i]==candidates[i-1])
                continue;
            subAns.add(candidates[i]);
            findAns(candidates, target-candidates[i], i+1,ans, subAns);
            subAns.remove(subAns.size()-1);
        }
    }
}