class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows= image.length;
        int columns = image[0].length;
        boolean visited[][] = new boolean[rows][columns];
        int startcolor = image[sr][sc];
        bfs(sr, sc, visited, color, startcolor, image);
        return image;
    }
    public static void dfs(int sr, int sc,boolean visited[][] ,  int color,int startcolor, int [][] image){
        visited[sr][sc] = true;
        image [sr][sc] = color;
        int dx [] = {0,0,-1,1};
        int dy [] = {-1,1,0,0};
        for(int i=0;i<4;i++){
            int x = sr+dx[i];
            int y = sc+dy[i];
            if(x>=0 && y>=0 && x<image.length && y<image[0].length && visited[x][y] == false && image[x][y]== startcolor){
                dfs(x,y,visited, color, startcolor, image);
            }
        }
    }
    public static void bfs(int sr, int sc,boolean visited[][] ,  int color,int startcolor, int [][] image){
        int dx [] = {0,0,-1,1};
        int dy [] = {-1,1,0,0};
        Queue<int[]> q = new LinkedList<>();
        int a [] = {sr,sc};
        q.add(a);
        while(q.size()>0){
            a = q.poll();
            sr = a[0];
            sc = a[1];
            image [sr][sc] = color;
            visited[sr][sc] = true;
            for(int i=0;i<4;i++){
            int x = sr+dx[i];
            int y = sc+dy[i];
            if(x>=0 && y>=0 && x<image.length && y<image[0].length && visited[x][y] == false && image[x][y]== startcolor){
                int ar [] = {x,y};
                q.add(ar);
            }
           }
        }

    }
}