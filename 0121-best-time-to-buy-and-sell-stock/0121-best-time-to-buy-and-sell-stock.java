class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for(int price:prices){
            if(price-min>ans){
                ans = price-min;
            }
            if(price<min){
                min = price;
            }
       }
        return ans;
    }
}