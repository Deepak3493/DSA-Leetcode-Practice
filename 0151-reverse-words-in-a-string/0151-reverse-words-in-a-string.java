class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String subAns = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
             
            if((ch>=48 && ch<=91)|| (ch>=97 && ch<=122)){
                if(subAns == " ")
                    subAns = "";
                subAns = subAns + ch + "";
              }else{
                if(subAns == " " )
                    continue;
                ans =  ch+subAns+ans;
                subAns = " "; 
              }
        }
        return (subAns+ans).trim();
    }
}