class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ansSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            getTwoSum(nums,i+1,ansSet,k);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(ansSet);
        return ans;
    }
    public static void getTwoSum(int nums[], 
       int index, HashSet<List<Integer>> ansSet,int val){
       int start = index;
       int end = nums.length-1;
       while(start<end){
           int first = nums[start];
           int second = nums[end];
           int sum = first+second+val;
           if(sum==0){
              if(!ansSet.contains(List.of(val, first, second))){
                  ansSet.add(List.of(val, first, second));
              }
           }
           if(sum>0){
               end--;
           }
           else{
              start++;
           }
       }
    }
}