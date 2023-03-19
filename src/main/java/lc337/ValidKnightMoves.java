package lc337;

public class ValidKnightMoves {
    public boolean check(int[][] grid,int r,int c,int move,int m,int n){

        if(r<0 || r>=m || c<0 || c>=n) return false;
        if(grid[r][c]!=move) return false;
        if( move==(m*n-1) && grid[r][c]==((m*n)-1)) return true;


        if(check(grid,r-2,c+1,move+1,m,n)==true) return true;
        if(check(grid,r-1,c+2,move+1,m,n)==true) return true;
        if(check(grid,r+1,c+2,move+1,m,n)==true) return true;
        if(check(grid,r+2,c+1,move+1,m,n)==true) return true;
        if(check(grid,r+2,c-1,move+1,m,n)==true) return true;
        if(check(grid,r+1,c-2,move+1,m,n)==true) return true;
        if(check(grid,r-1,c-2,move+1,m,n)==true) return true;
        if(check(grid,r-2,c-1,move+1,m,n)==true) return true;

        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        return check(grid,0,0,0,m,n);
    }
}
