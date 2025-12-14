class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = "";
        for(int i=0;i<s.length();i++){
           s2 = s.charAt(i)+s2;
        }
        return longestCommonSubsequence(s, s2);
    }
     public int longestCommonSubsequence(String text1, String text2) {
        String s1;
        String s2;
        if(text1.length()>text2.length()){
            s1 = text1;
            s2 = text2;
        }
        else{
            s1 = text2;
            s2 = text1;
        }
        int dp[][] = new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                dp[i][j] = -1;
            }
        }
        return LCS(s1,s2,dp,s1.length()-1,s2.length()-1);
    }
    public static int LCS(String S1, String S2, int dp[][], int a, int b){
        if(a<0 || b<0){
            return 0;
        }

        if(dp[a][b]!=-1){
            return dp[a][b];
        }
        
        int ans = -1;
        if(S1.charAt(a) == S2.charAt(b)){
           ans = 1+LCS(S1,S2,dp,a-1,b-1);
        }
        int ans2 = Math.max(LCS(S1,S2,dp, a-1,b), LCS(S1,S2,dp, a,b-1));
        return dp[a][b] = Math.max(ans, ans2);
    }
}