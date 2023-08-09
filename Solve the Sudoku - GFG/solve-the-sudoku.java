//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here

        return solvesudoku(grid,0,0);
        // if(ans)
        //   printGrid(grid);
        // return ans;
        
    }
    static boolean solvesudoku(int grid[][],int i, int j){
        if(i==grid.length-1 && j ==grid[0].length){
            return true;
        }
        
        if(j==grid[0].length){
            j=0;
            i= i+1;
        }
        if(i==grid.length){
            return false;
        }
        
        if(grid[i][j]!=0){
            return solvesudoku(grid,i,j+1);
        }
        
        boolean flag = false;
        for(int x=0;x<9;x++){
            if(isPossible(grid, x+1,  i , j )){
                grid[i][j] = x+1;
                if(solvesudoku(grid,i,j+1))
                    return true;
                grid[i][j] = 0;
            }
        }
        return flag;
        
    }
    
    public static boolean isPossible(int [][]grid,int val, int i, int j){
        
        
        // cols
        for(int x=0;x<grid[0].length;x++){
            if(grid[i][x]== val){
                return false;
            }
        }
        
        // rows
        for(int x=0;x<grid.length;x++){
            if(grid[x][j] == val)
                   return false;
        }
        
        // 3*3 matrix;
        int a = (i/3)*3;
        int b = (j/3)*3;
        for(int x = 0;x<3;x++){
            for(int y=0;y<3;y++){
                if(x+a<9 && y+b<9 && grid[x+a][y+b] == val){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
         for(int x = 0;x<grid.length;x++){
            for(int y=0;y<grid[0].length;y++){
                System.out.print(grid[x][y]+" ");
            }
            // System.out.println();
        }
    }
}