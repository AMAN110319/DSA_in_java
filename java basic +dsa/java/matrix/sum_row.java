public class sum_row {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{8, 7, 4}, {4, 9, 8}};
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=0; j<a[0].length; j++){
                sum+=a[i][j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=0; j<a[0].length; j++){
                sum+=a[j][i];
            }
            System.out.print(sum+" ");
        }
    }
}
