class Solution {
    public void gameOfLife(int[][] board) {
       
        int newBoard[][] = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count = 0;
                int k = board[i][j];
                if(i>0 && board[i-1][j]==1){
                    count++;
                }
                if(j>0 && board[i][j-1]==1){
                    count++;
                }
                if(i+1<board.length && board[i+1][j]==1){
                    count++;
                }
                if(j+1<board[0].length && board[i][j+1]==1){
                    count++;
                }
                if(i+1<board.length && j+1<board[0].length && board[i+1][j+1]==1){
                    count++;
                }
                if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1){
                    count++;
                }
                if(i>0 && j+1<board[0].length && board[i-1][j+1]==1){
                    count++;
                }
                if(i+1<board.length && j-1>=0 && board[i+1][j-1]==1){
                    count++;
                }

                if(k==1 && (count == 2 || count == 3 )){
                    newBoard[i][j] = 1;
                }
                if(k==0 && count ==3){
                    newBoard[i][j] = 1;
                }

                //System.out.println("Cell at i,j "+ i +" "+ j +" "+ board[i][j] +" have count "+count);

            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] =  newBoard[i][j];
            }
        }
    }
}