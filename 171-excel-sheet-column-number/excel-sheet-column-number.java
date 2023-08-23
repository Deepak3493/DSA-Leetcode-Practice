class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int num = 1;
        int ans = 0;
        for(int i = n-1;i>=0;i--){
           int k = columnTitle.charAt(i) - 'A';
           ans = ans+ (k+1)*(num);
           num = num*26;
        }
        return ans;
    }
}