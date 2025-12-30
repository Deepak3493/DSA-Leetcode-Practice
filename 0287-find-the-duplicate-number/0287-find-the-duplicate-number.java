class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        boolean first = true;
        while(first == true || slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
            first = false;
        }
        int start = nums[0];
        while(slow!=start){
            slow = nums[slow];
            start = nums[start];
        }
        return slow;
    }
}