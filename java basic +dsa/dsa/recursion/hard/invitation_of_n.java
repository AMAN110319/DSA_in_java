public class invitation_of_n {
    public static int guest_invite(int n){
        if(n<=1){
            return 1;
        }
        return guest_invite(n-1)/*for singles */+(n-1)*guest_invite(n-2);//for couples
    }
    public static void main(String[] args) {
        int n= 4;
        int totalways= guest_invite(n);
        System.out.println(totalways);
    }
    
}
