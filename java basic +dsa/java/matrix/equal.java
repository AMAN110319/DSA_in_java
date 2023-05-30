public class equal {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,5,3}};  
        boolean flag = true;    
            for(int i=0; i<3;i++){
                for(int j=0; j<3; j++){
                    if(a[i][j]!=b[i][j]){
                        flag = false; 
                        break;

                    }
                    
                }
            }
            if(flag){
                System.out.println("the two matrices are equal...");
            }
            else{
                System.out.println("the two matrices are not equal...");
            }
    }
}
