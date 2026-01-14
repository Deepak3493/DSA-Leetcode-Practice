class Solution {
    public boolean exist(char[][] board, String word) {
        char startChar = word.charAt(0);
        boolean visited[][] = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char ch = board[i][j];
                if(ch == startChar){
                    if(dfs(board, word.substring(1), i, j, visited))
                           return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] board, String word, int x , int y, boolean visited[][]){
        //System.out.println(word);
        if(word.length()==0){
            return true;
        }
        visited[x][y] = true;
        char ch = word.charAt(0);
        int dx [] = {1,0,0,-1};
        int dy [] = {0,1,-1,0};
        boolean ans = false;
        for(int i=0;i<4;i++){
            int xx = x+dx[i];
            int yy = y+dy[i];
            if(xx>=0 & xx<board.length && yy>=0 && yy<board[0].length && ch == board[xx][yy] && visited[xx][yy]==false){
                //visited[xx][yy] = true;
                ans = ans || dfs(board, word.substring(1), xx, yy, visited);
               // visited[xx][yy] = false;
            }
        }
        visited[x][y] = false;
        return ans;

    }
}