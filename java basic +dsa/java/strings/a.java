import java.util.*;
public class a {

    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);                    
        int t = s.nextInt();
        System.out.println(t);
        while(t--> 0)
        {
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println(n +" "+ m);
            char[][] arr = new char[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                {
                    arr[i][j] = s.next().charAt(0);
                }   
            }
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        

    }
}
