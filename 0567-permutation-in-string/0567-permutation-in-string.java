class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start1 =0;
        int start2 = s1.length();
        int end = s2.length();
        s1 = sortstr(s1);
        while(start2<=end){
            String s = sortstr(s2.substring(start1,start2));
            //System.out.println(s1+" "+s);
            if(s.equals(s1)){
                return true;
            }
            start1++;
            start2++;
        }
        return false;
    }
    public static String sortstr(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        return sortedStr;
    }
}