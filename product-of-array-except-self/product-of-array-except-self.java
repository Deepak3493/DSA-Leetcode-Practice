class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int countzeros = 0;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               countzeros++;
           }
           else{
               prod = prod*nums[i];
           }
        }
        if(countzeros==0){
             for(int i=0;i<nums.length;i++){
                 ans[i] = prod/nums[i];
             }
        }
        if(countzeros==1){
              for(int i=0;i<nums.length;i++){
                 if(nums[i]==0){
                     ans[i]= prod;
                 }
             }
        }
        return ans;
    }
}