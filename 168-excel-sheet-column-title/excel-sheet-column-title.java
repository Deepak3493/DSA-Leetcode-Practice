class Solution {
    public String convertToTitle(int n) {
       String result="";
        while(n>0){
            result=(char)('A'+(--n)%26)+result;
            n=(n)/26;
        }
        return result;
    }
}