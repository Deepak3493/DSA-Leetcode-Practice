class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int fistSmallestInd = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                fistSmallestInd = i-1;
                break;
            }
        }
        // System.out.println(fistSmallestInd);
        if(fistSmallestInd==-1){
            int start = 0;
            int end = n-1;
            while(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            return ;
        }
         
        int indexToReplaceWith = -1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[fistSmallestInd]){
                indexToReplaceWith = i;
                break;
            }
        }
        // System.out.println(indexToReplaceWith);
        int temp = nums[indexToReplaceWith];
        nums[indexToReplaceWith] = nums[fistSmallestInd];
        nums[fistSmallestInd] = temp;


        int start = fistSmallestInd+1;
        int end = n-1;
        while(start<=end){
            int temp2 = nums[start];
            nums[start] = nums[end];
            nums[end] = temp2;
            start++;
            end--;
        }
    }
}