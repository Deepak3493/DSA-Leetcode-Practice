class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int one = 2;
        int two = 1;
        int ans = 2;
        for(int i=3;i<=n;i++){
             ans = one+two;
             two = one;
             one = ans;
        }
        return one;
    }
}