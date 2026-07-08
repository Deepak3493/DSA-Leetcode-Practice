


class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // String s2 = "";
        // for(char ch :s.toCharArray())
        //     s2 = ch+s2;
        int dp[][]= new int [text1.length()+1][text2.length()+1];
        for(int i=0;i<text1.length()+1;i++)
            Arrays.fill(dp[i],-1);

        return lcs(text1, text2, dp, 0,0);

        // now iterate over dp array and form the LPS;

        //  String ans = "";
        //  int i=0,j=0;
        //  while (i < s.length() && j < s.length()) {
        //     if (s.charAt(i) == s2.charAt(j)) {
        //         ans+=s.charAt(i);
        //         i++;
        //         j++;
        //     } else {
        //         // Peek at your recursive options and pick the maximum path
        //         int moveDown = dp[i + 1][j];
        //         int moveRight = dp[i][j + 1];

        //         if (moveDown >= moveRight) {
        //             i++;
        //         } else {
        //             j++;
        //         }
        //     }
        // }
        // return ans;

    }
    public static int lcs(String s1 , String s2, int dp[][],int i, int j){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1+lcs(s1, s2, dp, i+1, j+1);
        }
        else{
            dp[i][j] = Math.max(lcs(s1, s2, dp, i, j+1), lcs(s1, s2, dp, i+1, j));
        }
        return dp[i][j];
        
    }
}