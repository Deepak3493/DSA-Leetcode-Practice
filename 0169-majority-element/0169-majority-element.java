class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            if (k == num) {
                count++;
            } else {
                count--;
                if (count <= 0) {
                    num = k;
                    count = 1;
                }
            }
        }
        return num;
    }
}