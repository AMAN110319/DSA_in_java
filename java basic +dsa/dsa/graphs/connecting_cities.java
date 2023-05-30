// it is one of the application of MST using prims can 
// easily solve this problem


import java.util.*;
public class connecting_cities {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        public Edge(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost; // ascending order me sort
        }

    }

    public static int connectingCities(int cities[][]){
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        boolean vis[]= new boolean[cities.length];
// start with the source 
        pq.add(new Edge(0,0));
        int finalcost = 0;

        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest]= true;
                finalcost +=curr.cost;
//              neighbours

                for(int i=0;i<cities[curr.dest].length;i++){
                    if(cities[curr.dest][i] !=0){
                        pq.add(new Edge(i,cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalcost;
    }

    
    public static void main(String[] args) {
       int cities[][]={{0,1,2,3,4},
                        {1,0,5,0,7},
                        {2,5,0,6,0},
                        {3,0,6,0,0},
                        {4,7,0,0,0}};

System.out.println(connectingCities(cities));
    }
}
