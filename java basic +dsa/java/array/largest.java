public class largest {
    
    public static void main(String[] args) {
        int []arr={2,345,2,4,5,6,784,8,9,10,47,81,34};
        int max=arr[0];
        //base ko reference lete hue..
            for(int j=0; j<arr.length; j++) {
                if(arr[j]>max){
                    max=arr[j];
                }
        }
    System.out.println("the largest value is:"+max);
}
}
