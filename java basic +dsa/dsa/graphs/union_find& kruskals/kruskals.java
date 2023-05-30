import java.util.*;
public class kruskals {
    static class Edge implements Comparable<Edge> {
        int src;
        int dst;
        int cost;
        public Edge(int src, int dst, int cost) {
            this.src = src;
            this.dst =dst;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }

    // arraylist of edges --> one of four ways to represent
    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }
    static int n=4;
    static int par[]=new int[n];
    static int rank[]=new int[n];

// initialized the parent
    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }

    // find function
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return find(par[x]);
        // optimized 
        // return par[x]=find(par[x]);
    }

    // union function
    public static void union(int a, int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }
        else{
            par[parB]=parA;
        }
    }


    // kruskals
    public static int kruskals_MST(ArrayList<Edge> edges,int V){
        init();
        Collections.sort(edges);// ascending order me sort 
        int anscost=0;
        int count=0;
        for(int i=0;count<V-1;i++){
            Edge e = edges.get(i);
            // (src,dest,wt)
            int parA = find(e.src);
            int parB = find(e.dst);

            if(parA !=parB){
               union(e.src,e.dst);
               anscost+=e.cost;
               count++;
            }
        }
        return anscost;
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> edges = new ArrayList<Edge>();
        createGraph(edges);

        System.out.println(kruskals_MST(edges, V));
    }
}
