class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        permute(ans, nums, 0, subAns);
        return ans;
    }
    public static void permute(List<List<Integer>> ans, int nums[], int ind, List<Integer> subAns){
       
        if(subAns.size()==nums.length){
            ans.add(new ArrayList<>(subAns));
            return;
        }
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=Integer.MAX_VALUE){
            subAns.add(nums[i]);
            int c = nums[i];
            nums[i] = Integer.MAX_VALUE;
            permute(ans,nums,i,subAns);
            nums[i] = c;
            subAns.remove(subAns.size()-1);
        }

        }
    }
}