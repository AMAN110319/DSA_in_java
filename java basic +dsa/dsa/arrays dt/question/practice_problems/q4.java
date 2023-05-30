public class q4 {
    public static void main(String[] args) {
        int arr[]={4, 2, 0, 3, 2, 5};
        // leftmax 
        int leftmax[]=new int[arr.length];
        leftmax[0]= arr[0];
        for (int i=1; i<arr.length; i++) {
            leftmax[i]=Math.max(arr[i], leftmax[i-1]);
        }

        // rightmax

        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--) {
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
        }
        int totalwater=0;
        // trapped pani 
        for(int i=0; i<arr.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            totalwater += waterlevel-arr[i];
        }
        System.out.println(totalwater);
    }
}
