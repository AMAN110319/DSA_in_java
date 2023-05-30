public class multiply {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
            
        int i=0,j=0,k=0;
        int [][]c= new int[3][3];
        System.out.println("the value of the matrix after multiplication is:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    c[i][j] += a[i][k]*b[k][j];
                    
                }
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
        
    }
}
