class Solution {
    public String longestCommonPrefix(String[] strs) {
        int longestLengthWord = 200;
        String ans = "";
        for(int i=0;i<=longestLengthWord;i++){
            char ch = ' ';
            for(int j = 0;j<strs.length;j++){
                  String s = strs[j];
                  if(s.length()<=i){
                      return ans;
                  }
                  char ch1 = s.charAt(i);
                  if(j==0){
                     ch = ch1;
                  }
                  else{
                     if(ch1 != ch){
                          return ans;
                     }
                  }
            }
            ans += ch+"";
        }
        return ans;
    }
}