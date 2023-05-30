import java.util.*;
public class FLOODFILL {
    public static void helper(int[][] image, int sr, int sc, int color,boolean vis[][],int orgcol){
        // base case
        if(sc<0 || sr<0||sr>=image.length||sc>=image[0].length || vis[sr][sc]|| image[sr][sc] != orgcol){
            return;
        }


        image[sr][sc] = color;
        // left
        helper(image, sr, sc-1, color, vis, orgcol);
        // right
        helper(image, sr, sc+1, color, vis,orgcol);
        // up
        helper(image, sr-1, sc, color, vis, orgcol);
        // down
        helper(image, sr+1, sc, color, vis, orgcol);


    }



    public static int[][] floodfill(int[][] image, int sr, int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        if(image[sr][sc] == color) return image;


        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }


    public static void main(String[] args) {
       int [][]image ={{1,1,1},
                        {1,1,0},
                        {1,0,1}};

        
    }
}
