public class duplicate {
    public static void main(String[] args) {
        int []arr= {1,2,4,1,5,2,45,6,7,4};
        System.out.println("the duplicate elements in the given array is:");
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]==arr[i]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
