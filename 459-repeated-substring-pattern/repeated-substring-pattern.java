class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String subStr = "";
        for(int i=0;i<s.length()-1;i++){
            subStr+=s.charAt(i);
            int leftlength = s.length()-i-1;
          
            if(leftlength%(i+1)==0){
                int k = leftlength/(i+1);
                //System.out.println(subStr+" "+leftlength+" "+(i+1)+" "+subStr.repeat(k));
                if((subStr.repeat(k+1)).equals(s))
                    return true;

            }
        }
        return false;
    }
}