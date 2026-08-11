class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp [][] = new Boolean[s.length()][s.length()];
        // for(int t[]:dp){
        //     Arrays.fill(t,-1);
        // }
        return solve(0,0,s, new HashSet<>(wordDict), dp);
    }
    public static boolean solve(int s, int e, String str, HashSet<String> set, Boolean dp [][] ){
        if(e == str.length()-1){
            if(set.contains(str.substring(s, e+1))){
                return dp[s][e] = true;
            }
            return dp[s][e] = false;
        }
        if(dp[s][e]!= null){
            return dp[s][e];
        }
        if(set.contains(str.substring(s, e+1))){
               if(solve(e+1,e+1, str, set, dp)){
                return dp[s][e] = true;
            }
        }

        return dp[s][e] = solve(s,e+1,str, set, dp);

    }
}