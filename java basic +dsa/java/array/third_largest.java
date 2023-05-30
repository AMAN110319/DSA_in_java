public class third_largest {
    public static void main(String[] args) {
        int []x={2,34,67,223,556,12,445,234};
        for(int i=0;i<x.length-1;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[j]<x[i]){
                    int temp=x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
        }

        System.out.println("the 3rd largest is :"+x[x.length-3]);
        System.out.println("the 2nd largest is :"+x[x.length-2]);
    }
}
