public class lowerTM {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{8, 6, 4}, {4, 5, 6}};
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                if(j>i){
                    a[i][j]=0;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
