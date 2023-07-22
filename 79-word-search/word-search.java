class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        boolean visited [][] =  new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                char ch = board[i][j];
                if(ch == word.charAt(0) && dfs(board, word.substring(1), visited, i, j))
                       return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, boolean visited [][], int x, int y ){
        if(word.length()==0){
            return true;
        }
        visited[x][y] = true;
        int dx[] = {1,-1,0,0};
        int dy[] = {0,0,-1,1};
        for(int i =0;i<4;i++){
            int p = x+dx[i];
            int q = y+dy[i];
            if(p>=0 && p<board.length && q>=0 && q<board[0].length && word.charAt(0) == board[p][q] && visited[p][q]== false){
                if(dfs(board, word.substring(1), visited, p, q)){
                    return true;
                }
            }
            
        }
        visited[x][y] =false;
        return false;
     }
}