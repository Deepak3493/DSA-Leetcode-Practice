class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 0;
        int arr[] = new int[nums.length];
        int k = 0;
        while (i < nums.length || j < nums.length) {
            while (i < nums.length && nums[i] < 0) {
                i++;
            }
            if (i < nums.length)
                arr[k++] = nums[i++];
            while (j < nums.length && nums[j] > 0) {
                j++;
            }
            if (j < nums.length)
                arr[k++] = nums[j++];
        }

        return arr;
    }
}