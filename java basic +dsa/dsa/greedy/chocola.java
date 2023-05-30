import java.util.*;
public class chocola {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costVer[] ={2,1,3,1,4};
        Integer costhor[]={4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());
        int h=0, v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<costVer.length && v <costhor.length){
            //VERTICAL <HORIZONTAL 
            if(costVer[v]<=costhor[h]){
                // horizontal cut
                cost += (costhor[h]*vp);
                hp++;
                h++;
            }

            else{
                // vertical 
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
            cost += (costhor[h]*vp);
                hp++;
                h++;
        }
        while(v<costVer.length){
            cost += (costVer[v]*hp);
                vp++;
                v++;
        }

        System.out.println("the minimum cost of the chocolate cut are:"+cost);
    }
}
