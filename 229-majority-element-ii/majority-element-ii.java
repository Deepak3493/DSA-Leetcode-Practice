class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int count1 = 0;
       int count2 = 0;
       int ans1 = -1;
       int ans2 = -1;
       for(int i = 0;i<nums.length;i++){
            int k = nums[i];
            if(count1 == 0 && k!=ans2){
                ans1 = k;
            }
            else if(count2 == 0 && k!=ans1){
                ans2 = k;
            }
            if(k==ans1 ){
               count1++;
            }
            else if(k==ans2){
               count2++;
            }
            else{
                count1--;
                count2--;
            }
       }
       List<Integer> ansList = new ArrayList<>();
       int k1=0;
       int k2=0;
       for(int i=0;i<nums.length;i++){
            if(nums[i]==ans1){
                k1++;
            }
            else if(nums[i] == ans2){
                k2++;
            }
       }
        if(k1>Math.floor(nums.length*1.0)/3.0)
           ansList.add(ans1);
        if(k2>Math.floor(nums.length*1.0)/3.0 && ans1 != ans2)
           ansList.add(ans2);
       return ansList;
    }
}