// it is an important algorithm in context of greedy and weighted as well
// it is an algorithm which is used in google maps as well

import java.util.*;
public class dijkstras{
    // for storing the info of edges 
    static class Edge{
       int src;
       int dest;
       int weight;
       public Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
       } 
    }
    public static void createGraph(ArrayList<Edge> graph[]){ 
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }
    // this pair class has the information about the node/vertex (n) and the path-->cost of the shortest path between 
    static class Pair implements Comparable<Pair>{
        int n ;
        int path;
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; // this returns the value chhota woh pahle return karega

        }
    }

    public static void dijkstra(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];// store dist from src to i

        boolean vis[]=new boolean[graph.length];// for tracking the visited nodes as well

// assigning the values of the graph
        for(int i=0;i<graph.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;// initialize with infinite value

            }
        }

        // bfs starts 
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                // check for the neighbours 
                for(int i = 0; i <graph[curr.n].size(); i++){
                   Edge e = graph[curr.n].get(i);
                   int u = e.src;
                   int v= e.dest;
                    int wt = e.weight;


                    // relaxation technique
                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        // need to push that as well
                        
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        dijkstra(graph,0);

    }
}
