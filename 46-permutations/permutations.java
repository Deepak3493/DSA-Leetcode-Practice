class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        permute(nums, ans, subAns, 0, nums.length);
        return ans;
    }
    public void permute(int[] nums, List<List<Integer>> ans,  List<Integer> subAns, int start, int end ){
       int count = 0;
       for(int i=start;i<end;i++){
           int temp = nums[i];
           if(nums[i]!=-100){
              subAns.add(nums[i]);
              nums[i] = -100;
              permute(nums, ans, subAns, start, end);
              if(subAns.size()>0)
              subAns.remove(subAns.size()-1);
               nums[i] = temp;
           }
           else{
               count++;
               if(count == nums.length)
                   ans.add(List.copyOf(subAns));
           }
       }

    }
}