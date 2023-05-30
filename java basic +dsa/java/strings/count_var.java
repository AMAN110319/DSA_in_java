public class count_var {
    static int chkPair(int A[], int size, int x) {
        int count = 0;
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if ((A[i] + A[j])%x==0) {
                    System.out.println("Pairs greater than  a given sum " + x +
                                       " is (" + A[i] + ", " + A[j] + ")");
                    count++;
                    
                }
            }
        }
        return count;
   
    }
   
    public static void main(String [] args) {
       
        int A[] = {0, -1, 2, -3, 1,5,7,8,3};
        int x = 5;
        int size = A.length;
        int y=chkPair(A, size,x);
        System.out.println(y);
        
    } 
}
