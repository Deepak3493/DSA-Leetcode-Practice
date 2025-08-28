class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for(int price:prices){
            int k = price-min;
            if(k>ans){
                ans = k;
            }
            if(price<min){
                min = price;
            }
       }
        return ans;
    }
}