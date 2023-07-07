class Solution {
    public int maxProduct(int[] nums) {
        int prod1 = nums[0]!=0? nums[0] : 1;
        int prod1Ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int k = nums[i];
            prod1 = prod1*k;
            if(prod1==0){
                prod1Ans = Math.max(prod1,prod1Ans);
                prod1 = 1;
            }
            else{
              prod1Ans = Math.max(prod1,prod1Ans);
            }
        }
        
        System.out.println(prod1Ans+" ");
        int prod2 = nums[nums.length-1]!=0? nums[nums.length-1] : 1;
        int prod2Ans = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            int k = nums[i];
            prod2 = prod2*k;
            if(prod2==0){
                prod2Ans = Math.max(prod2,prod2Ans);
                prod2 = 1;
            }
            else{
              prod2Ans = Math.max(prod2,prod2Ans);
            }
        }
        System.out.println(prod2Ans+" ");
        return Math.max(prod1Ans, prod2Ans);
    }
}