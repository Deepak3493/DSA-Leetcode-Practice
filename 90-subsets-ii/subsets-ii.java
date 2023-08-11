class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, 0, ans, subAns);
        return ans;
    }
    public static void subsets(int nums[], int start,List<List<Integer>> ans,  List<Integer> subAns){
      
        List<Integer> subAnsCollected = new ArrayList<>();
        for(int i=0;i<subAns.size();i++){
            subAnsCollected.add(subAns.get(i));
        }
        ans.add(subAnsCollected);
        for(int i=start;i<nums.length;i++){
            if(i != start && nums[i]==nums[i-1])
                continue;
            subAns.add(nums[i]);
            subsets(nums,i+1,ans, subAns);
            subAns.remove(subAns.size()-1);
        }
    }
}