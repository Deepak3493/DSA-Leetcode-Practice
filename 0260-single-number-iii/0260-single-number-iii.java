class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        int rightMostSetBit = ans & -ans;
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            int bd= k & rightMostSetBit;
            if( bd == 0){
                a = a^k;
            }
            else{
                b= b^k;
            }
        }
        return new int[]{a,b};

    }
}