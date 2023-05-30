// important for the usage of the graphs
// used only for DAGS ONLY
import java.util.*;
public class topological_dfs{
    static class Edge{
        int dest;
        int src;
        public Edge(int src, int dest){
            this.dest = dest;
            this.src = src;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length;i++){
            graph[i] = new ArrayList<Edge>();//khali arraylist
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        
    }
    public static void topSort(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> s= new Stack<Integer>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s);//modified dfs
            }
        }

        // for printing in a topological order of print 
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }


    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean[] vis,Stack<Integer> s){

        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int V =6;
        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);
  
        topSort(graph);
    }

}