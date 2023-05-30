public class tiles_on_room {
    public static int placetiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //horizontal placement
        int horizontaltile= placetiles(n-1,m);
        // vertical placement
        int verticaltile= placetiles(n-m,m);
        return horizontaltile+verticaltile;
    }
    public static void main(String[] args) {
        int n=2,m=2;
        int totalways=placetiles(n,m);
        System.out.println(totalways);
    }
    
}
