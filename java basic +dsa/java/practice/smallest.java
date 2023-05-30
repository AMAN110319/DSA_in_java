public class smallest {
    
    public static void main(String[] args) {
        int a=9,b=6,c=3;
        int temp;
        if(a<b){
            temp = (a<c) ? a:c;
        }
        else {
            temp =(b<c)? b:c;
        }
        System.out.println("smallest"+temp);
    }
}
