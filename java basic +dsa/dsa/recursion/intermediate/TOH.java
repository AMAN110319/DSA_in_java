public class TOH{
    public static int towerOfHanoi(int n, String Beg , String Aux , String End){
        int count =0;
        if(n==1){
           System.out.println("Transfer disk "+n+" from "+Beg+" to "+End);
           return 1;
        }
        count +=towerOfHanoi(n-1,Beg,End,Aux);
        System.out.println("Transfer disk "+n+" from "+Beg+" to "+End);
        count++;
        count +=towerOfHanoi(n-1,Aux,Beg,End);
        return count;
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println("totalsteps are:"+towerOfHanoi(n,"B","A","E"));
    }
}