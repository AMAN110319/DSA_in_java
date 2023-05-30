import java.util.*;
public class kosaraju{

    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));
    }
    public static void topSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr +" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void kosaraju(ArrayList<Edge> graph[],int V){
        // step 1:
        Stack<Integer> stack = new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
            topSort(graph, i, vis, stack);
            }
        }

        // step 2 : create the transpose
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;//re initialised to false
            transpose[i] = new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                 Edge e = graph[i].get(j);
                 transpose[e.dest].add(new Edge(e.dest,e.src)); //reverse the arrow
            }
        }

        // step 3
        while(!stack.isEmpty()){
           int curr = stack.pop();
           if(!vis[curr]){
                    System.out.print("Scc->");
                    dfs(transpose,curr,vis);
                    System.out.println();
           }
        }
         
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];

        createGraph(graph);
        kosaraju(graph, V);
    }
}