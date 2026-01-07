class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> helper = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            if(helper.size()>0){
                int helperSize = helper.size();
                int lastEleOfHelper = helper.get(helperSize-1);
                if(lastEleOfHelper<k){
                   helper.add(k);
                }
                else{
                    if(lastEleOfHelper>k){
                        replaceElementInHelper(helper,k);
                    }
                }
            }
            else{
                helper.add(k);
            }
        }
        return helper.size();
    }
    public static void replaceElementInHelper(List<Integer> helper, int k){
        int start = 0;
        int end = helper.size();
        int pos = 0;
        // System.out.println(k);
        // System.out.println(helper.toString());
        while(start<=end){
            int mid = start+(end-start)/2;
            if(helper.get(mid)==k){
                return;
            }
            else if(helper.get(mid)<k){
                pos = mid+1;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        // System.out.println(pos);
        helper.set(pos, k);
    }
}