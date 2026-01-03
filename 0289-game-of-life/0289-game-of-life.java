class Solution {
    public void gameOfLife(int[][] board) {
       
        int newBoard[][] = new int[board.length][board[0].length];
        int one = -1;
        int zero = -2;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count = 0;
                int k = board[i][j];
                if(i>0 && (board[i-1][j]==1 || board[i-1][j]== one) ){
                    count++;
                }
                if(j>0 && (board[i][j-1]==1 ||  board[i][j-1] == one)){
                    count++;
                }
                if(i+1<board.length && (board[i+1][j]==1|| board[i+1][j]==one )){
                    count++;
                }
                if(j+1<board[0].length && (board[i][j+1]==1 ||board[i][j+1]== one)){
                    count++;
                }
                if(i+1<board.length && j+1<board[0].length && (board[i+1][j+1] == 1 ||  board[i+1][j+1] == one )){
                    count++;
                }
                if(i-1>=0 && j-1>=0 && (board[i-1][j-1]==1 || board[i-1][j-1]== one) ){
                    count++;
                }
                if(i>0 && j+1<board[0].length && (board[i-1][j+1]==1 ||  board[i-1][j+1]== one)){
                    count++;
                }
                if(i+1<board.length && j-1>=0 && (board[i+1][j-1]==1 ||board[i+1][j-1]== one)){
                    count++;
                }
                
                System.out.println("Cell at i,j "+ i +" "+ j +" "+ board[i][j] +" have count "+count);

                if(k==1 && (count == 2 || count == 3 )){
                    board[i][j] = 1;
                }
                else if(k==0 && count ==3){
                    board[i][j] = zero;
                }
                else {
                    if(board[i][j] == 1)
                        board[i][j] = one;
                }

            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == zero){
                    board[i][j] = 1;
                }
                if(board[i][j] == one){
                    board[i][j] = 0;
                }
                
            }
        }
    }

}