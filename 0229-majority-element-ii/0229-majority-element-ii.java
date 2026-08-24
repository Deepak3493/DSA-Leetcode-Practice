class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == num1) {
                count1++;
            } else if (num == num2) {
                count2++;
            } else if (count1 <= 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 <= 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int countcheck1 = 0;
        int countcheck2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                countcheck1++;
            }
            if (nums[i] == num2) {
                countcheck2++;
            }
        }
        if (countcheck1 > nums.length * 1.0 / 3)
            ans.add(num1);
        if (countcheck2 > nums.length * 1.0 / 3)
            ans.add(num2);
        return ans;
    }
}