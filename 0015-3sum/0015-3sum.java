class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            if(i>0  && nums[i] == nums[i-1]){
                continue;
            }
            findPair(nums, i+1, -k, ans);
        }
        return ans;
    }
    public void findPair(int nums[], int start, int target,  List<List<Integer>> ans){
        int end = nums.length-1;
        while(start<end){
            int a = nums[start];
            int b = nums[end];
            int sum = a+b;
            if(sum == target){
                List<Integer> subans = new ArrayList<>();
                subans.add(-target);
                subans.add(a);
                subans.add(b);
                ans.add(subans);
                if(a == b){
                    return;
                }
                if(nums[start] ==nums[start+1]){
                    while(start<end &&  nums[start] ==nums[start+1]){
                        start++;
                    }
                    start++;
                }
                else{
                    start++;
                }
                if(nums[end] ==nums[end-1]){
                    while(start<end && nums[end] ==nums[end-1]){
                        end--;
                    }
                    end--;
                }
                else{
                    end--;
                }
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
    }
}