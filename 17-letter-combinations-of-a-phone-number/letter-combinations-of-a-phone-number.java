class Solution {
    static String[] keyAlphas = {"","","abc", "def", "ghi" ,"jkl", "mno" , "pqrs","tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() ==0){
            List<String> subAns =  new ArrayList<>();
            return subAns;
        }
        char ch = digits.charAt(0);
        List<String> subAns = letterCombinations(digits.substring(1));
        if(subAns.size()==0){
            subAns.add("");
        }
        String keyAlpha = keyAlphas[ch-'0'];
        List<String> ans =  new ArrayList<>();
        for(int i=0;i<keyAlpha.length();i++){
            char ch2 = keyAlpha.charAt(i);
            for(int j=0;j<subAns.size();j++){
                String k = subAns.get(j);
                k=ch2+k;
                ans.add(k);
            }
        }
        return ans;
    }

}