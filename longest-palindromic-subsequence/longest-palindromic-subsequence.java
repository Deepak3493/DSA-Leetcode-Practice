

class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length()<=1){
            return s.length();
        }
        String r = reverse(s);
        int dp [][] = new int[s.length()+1][s.length()+1];
        for(int i=0;i<dp[0].length;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return LCS(s,r,s.length(),s.length(),dp);

        // String ans = "";
        // // for(int i=0;i<=s.length();i++){
        // //     for(int j=0;j<=r.length();j++){
        // //         System.out.print(dp[i][j]+" ");
        // //     }
        // //     System.out.println();
        // // }
        // int i = s.length();
        // int j = s.length();
        // while(i>0 && j>0){
        //     if(s.charAt(i-1)==r.charAt(j-1)){
        //         ans = r.charAt(j-1)+ans;
        //         i--;
        //         j--;
        //     }
        //     else if(dp[i-1][j] >= dp[i][j-1]){
        //         i--;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // System.out.println(ans);
        // return ans.length();
    }
    public static int LCS(String s1,String s2,int i, int j, int dp[][]){
        if(i<=0 || j<=0){
            return 0;
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        if(s1.charAt(i-1) == s2.charAt(j-1)){
            dp[i][j] = 1+LCS(s1,s2,i-1,j-1,dp);
        }
        else{
            dp[i][j] = Math.max(LCS(s1,s2,i-1,j,dp), LCS(s1,s2,i,j-1,dp));
        }
        return dp[i][j];
    }
    public static String reverse(String s){
        String reverse = "";
        for(int i=0;i<s.length();i++){
            reverse = s.charAt(i)+reverse;
        }
        return reverse;
    }
}