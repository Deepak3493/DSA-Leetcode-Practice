class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[][] = new Boolean[s.length()][s.length()];
        // for(int arr[]:dp){
        //     Arrays.fill(arr, -1);
        // }
        HashSet<String> londiya = new HashSet<>(wordDict);
        return findGspot(0,0,londiya,s, dp);
    }
    public static boolean findGspot(int upar, int neeche, HashSet<String> londiya, String s,  Boolean dp[][]){
        String neecheKaPaani;
        if(neeche > s.length()){
            return false;
        }
        if(neeche == s.length()){
            neecheKaPaani = s.substring(upar,neeche);
            //System.out.println(neecheKaPaani);
            return londiya.contains(neecheKaPaani);
        }
        if(dp[upar][neeche]!=null){
            return dp[upar][neeche];
        }
        neecheKaPaani = s.substring(upar,neeche);
        boolean result = false;
        if(londiya.contains(neecheKaPaani)){
            //System.out.println(neecheKaPaani);
            result =  findGspot(neeche, neeche+1,londiya, s, dp);
        }
        return dp[upar][neeche] = result || findGspot(upar, neeche+1,londiya, s, dp);
    }
}