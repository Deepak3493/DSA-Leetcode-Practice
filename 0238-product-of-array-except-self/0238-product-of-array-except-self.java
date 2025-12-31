class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output [] = new int[nums.length];
        int rightProd = 1;
        for(int i = nums.length-1;i>=0;i--){
             if(i == nums.length-1){
                output[i] = 1;
                continue;
             }
             rightProd = rightProd*nums[i+1];
             output[i] = rightProd;
        }

        int leftProd = 1;
        for(int i=1;i<nums.length;i++){
            leftProd = leftProd*nums[i-1];
            output[i] = leftProd*output[i];
            // System.out.println(leftProd+" "+output[i]);
        }
        return output;
    }
}