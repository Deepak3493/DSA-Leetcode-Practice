class Solution {
    public String longestPalindrome(String s) {
       if(s.length()==0){
        return "";
       }
       int ans = 0;
       int ansk = 0;
       int ansj = 0;
       for(int i=0;i<s.length();i++){
          int j = i-1; int k = i+1;;
          while(j>=0 && k<s.length()){
            if(s.charAt(j)== s.charAt(k)){
               if(k-j+1>ans){
                ans = k-j+1;
                ansj = j;
                ansk = k;
               }

               j--;
               k++;
            }
            else {
                break;
            }
          }
          j = i; k = i+1;
          while(j>=0 && k<s.length()){
            if(s.charAt(j)== s.charAt(k)){
                if(k-j+1>ans){
                ans = k-j+1;
                ansj = j;
                ansk = k;
               }
               j--;
               k++;
            }
            else {
                break;
            }
          }
           j = i-1; k = i;
          while(j>=0 && k<s.length()){
            if(s.charAt(j)== s.charAt(k)){
               if(k-j+1>ans){
                ans = k-j+1;
                ansj = j;
                ansk = k;
               }
               j--;
               k++;
            }
            else {
                break;
            }
          }
       } 
       return  ans>0 ? s.substring(ansj, ansk+1): s.charAt(0)+"";
    }
}