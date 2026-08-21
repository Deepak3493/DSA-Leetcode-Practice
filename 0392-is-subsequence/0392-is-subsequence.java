class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        Boolean dp[][] = new Boolean[s.length()][t.length()];
        return check(s, t, 0, 0, dp);
    }

    public boolean check(String s, String t, int i, int j, Boolean dp[][]) {
        if (i >= s.length()) {
            return true;
        }
        if (j >= t.length()) {
            return false;
        }

        if (dp[i][j] != null)
            return dp[i][j];

        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = check(s, t, i + 1, j + 1, dp);
        }

        return dp[i][j] = check(s, t, i, j + 1, dp);
    }
}