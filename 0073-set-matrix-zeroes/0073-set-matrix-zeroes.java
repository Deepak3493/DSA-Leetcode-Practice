class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row0 = false;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && matrix[i][j] == 0){
                   row0 = true;
                }
                else{
                    if(matrix[i][j]==0 ){
                        matrix[0][j]= 0;
                        matrix[i][0]= 0;
                    }
                }
                
            }
        } 



        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //       System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // } 


        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==0){
                    if(row0)
                       matrix[i][j] = 0; 
                }
                else if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                    // System.out.println(i+" "+j);
                }
            }
        }
        
    }
}