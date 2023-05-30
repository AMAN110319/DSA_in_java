public class elements {
    public static void main(String[] args) {
        int arr[]=new int[6],count=1;

        for (int i=0; i<arr.length; i++){
            arr[i]=count;
            count++;
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

    }
}
