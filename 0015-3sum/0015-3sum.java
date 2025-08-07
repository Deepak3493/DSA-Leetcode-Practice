class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            if(i>0 && nums[i]==nums[i-1])
                  continue;
            twoSum(nums, i+1, nums.length-1, num, ans);
        }
        return ans;
    }
    public static void twoSum(int nums[], int start, int end, int firstVal,
    List<List<Integer>> ans){
        int leftSum = - firstVal;
        while(start<end){
            int a = nums[start];
            int b = nums[end];
            int sum = a+b;
            if(sum == leftSum){
                List<Integer> subAns = new ArrayList<>();
                subAns.add(firstVal);
                subAns.add(a);
                subAns.add(b);
                ans.add(subAns);
                while(start<end && nums[start]==nums[start+1]){
                    start++;
                }
                while(end>start && nums[end]==nums[end-1]){
                    end--;
                }
                start++;
                end--;
            }
            else if(sum > leftSum){
                end--;
            }
            else{
                start++;
            }
        }
    }
}