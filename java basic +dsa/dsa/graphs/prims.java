 // it is the code for the prims algo


import java.util.*;
public class prims {
    static class Edge{
        int dest;
        int src;
        int weight;
        public Edge(int src, int dest, int weight){
            this.dest = dest;
            this.src = src;
            this.weight = weight;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        // initialized the empty arraylist
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
        
    }

    static class pair implements Comparable<pair>{
        int v;
        int cost;
        public pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void getmst(ArrayList<Edge> graph []){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair> pq =new PriorityQueue<pair>();

        pq.add(new pair(0, 0));//---> add to the mst set
        int finalCost =0;
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalCost += curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.dest,e.weight));
                }
                     
            }
        }

        System.out.println("the minimum cost of the graph is = "+finalCost);
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph []= new ArrayList[V];
        createGraph(graph);

        getmst(graph);
    }
}

