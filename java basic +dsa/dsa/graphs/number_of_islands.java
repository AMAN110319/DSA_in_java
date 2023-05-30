import java.util.*;
public class number_of_islands{
    static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static int numberOfIslands(char[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis = new int[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
    public static void bfs(int row,int col,int[][]vis, char[][] grid){
        vis[row][col] =1;
        // we are creating queue of pair type
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c=q.peek().second;
            q.remove();
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    // for going into 8 direction one by one
                    int nr=r+i;
                    int nc=r+j;
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1' && vis[nr][nc]==0){
                        vis[nr][nc]=1;
                        q.add(new Pair(nr,nc));
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
         char [][]grid={{'0','1','1','0'},{'0','1','1','0'},{'0','0','1','0'},{'0','0','0','0'},{'1','1','0','1'}};
         System.out.println("the number of islands are:"+numberOfIslands(grid));
    }
}