import java.util.*;
public class spiral{
    public static void print_spiral(int matrix[][]){
        int start_row=0;
        int end_row=matrix.length-1;
        int start_col=0;
        int end_col=matrix[0].length-1;

        while(start_row<= end_row && start_col<=end_col){
            //top row
            for(int i=start_col;i<=end_col;i++){
                System.out.print(matrix[start_row][i]+" ");
            }
            //right column
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(matrix[i][end_col]+" ");
            }
            //bottom row
            for(int i=end_col-1;i>=start_col;i--){
                //non repeatable case
                if(start_row==end_row){
                    return;
                }
                System.out.print(matrix[end_row][i]+" ");
            }
            //left column
            for(int i=end_row-1;i>=start_row+1;i--){
                if(start_col==end_col){
                    return;
                }
                System.out.print(matrix[i][start_col]+" ");
            }
            start_col++;
            end_col--;
            start_row++;
            end_row--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{12,13,14,15}};
        print_spiral(matrix);

    }
}