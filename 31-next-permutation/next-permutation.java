class Solution {
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        int index = -1;
        for(int i = size-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index == -1){
            int i = 0; int j = size-1;
            while(i<j){
                int start = nums[i];
                nums[i] = nums[j];
                nums[j] = start;
                i++;
                j--;
            }
            return;
        }
         //[1,2,3,3,2,4,5,6]
        int k = size-1;
        
        while(k>=0  && k>index){
            if(nums[k]>nums[index]){
               break;
            }
            k--;
        }
        //reverse from k to size;
        int start = nums[k];
        nums[k] = nums[index];
        nums[index] = start;
        int m = nums.length-1;
        int kk= index+1;
        //System.out.println(index+" "+m);
        while(kk<m){
            start = nums[kk];
            nums[kk] = nums[m];
            nums[m] = start;
            m--;
            kk++;
        }
    }
}