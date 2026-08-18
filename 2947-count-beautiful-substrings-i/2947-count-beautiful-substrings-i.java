class Solution {
    public int beautifulSubstrings(String s, int k) {
       
        int ans =0;
        for(int j=0;j<s.length();j++){
            int countv =0;
            int countc = 0;
            for(int i=j;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e' || 
                        ch == 'i' || ch == 'o'
                            || ch == 'u'){
                    countv++;
                }
                else{
                    countc++;
                }
                if(countv==countc && (countc*countv)%k==0){
                    ans++;
                }
            }
        }
        return ans;

    }
}