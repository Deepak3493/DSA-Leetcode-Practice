class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> subans = new ArrayList<>();
        subSets(nums, ans, subans,0);
        return ans;
    }
    public static void subSets(int nums[],  List<List<Integer>>ans,  List<Integer> subAns, int index ){
            if(index == nums.length){
              List<Integer> CopySubAns = new ArrayList<>(subAns);
              ans.add(CopySubAns);
              return;
            }

            subAns.add(nums[index]);
            subSets(nums, ans, subAns,index+1);

            subAns.remove(subAns.size()-1);
            subSets(nums, ans, subAns,index+1);

    }
}