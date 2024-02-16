class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1 )
          return s;
        char[][] matrix = new char[numRows][1000];
        int k = 0;
        int size = s.length();
        int l = numRows-2;
        for(int j=0;j<1000;j++){
            // fill completely
            if(j==0 || j%(numRows-1)==0){
                for(int i=0;i<numRows;i++){
                    if (k<size){
                        char ch = s.charAt(k);
                        matrix[i][j] = ch;
                        k++;
                    }
                }
                l = numRows-2;
            }
            // fill the single row
            else if (k<size){
                char ch = s.charAt(k);
                matrix[l][j] = ch;
                k++;
                l--;
            }
        }
        String ans = "";
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                char charAtIJ = matrix[i][j];
                if(charAtIJ != '\u0000'){
                    ans+=charAtIJ;
                }
            }
        }
        return ans;
       
    }
}