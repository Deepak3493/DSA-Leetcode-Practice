class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int k = nums[i];
            getTwoSum(nums,i+1,ans,k);
        }
        return ans;
    }
    public static void getTwoSum(int nums[], 
       int index, List<List<Integer>> ans,int val){
       int start = index;
       int end = nums.length-1;
       while(start<end){
           int first = nums[start];
           int second = nums[end];
           int sum = first+second+val;
           if(sum>0){
               end--;
           }
           else if(sum<0){
               start++;
           }else{
                ans.add(List.of(val, first, second));
                while((start+1<nums.length) && (nums[start+1] == nums[start])){
                    start++;
                }

                while((end-1>=0) && (nums[end-1] == nums[end])){
                    end--;
                }
                start++;
                end--;
           }
       }
    }
}