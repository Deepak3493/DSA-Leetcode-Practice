class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        if(n==1){
            if(nums[0]==1){
                return 2;
            }
            else{
                return 1;
            }
        }

        boolean isOnePresent = false;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                isOnePresent = true;
            }
        }

        if(!isOnePresent){
            return 1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]<1 || nums[i]>n){
                nums[i]=1;
            }
        }


        for(int i=0;i<n;i++){
            int ind = Math.abs(nums[i])-1;
            if(nums[ind]>0){
                nums[ind] = - nums[ind];
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;





    }
}