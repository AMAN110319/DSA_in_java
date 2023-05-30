// TC===O(V+E)


import java.util.*;
public class bfs_2 {
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
    // for solving the connected components as well
    // helps to cover all parts
    public static void bfs(ArrayList<Edge>[]graph){
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                bfsUtil(graph, visited);
            }
        }
    }
// a helper or util function
public static void bfsUtil(ArrayList<Edge>[] graph,boolean visited[]){
    Queue <Integer> q = new LinkedList<>();
    // boolean visited[] = new boolean[graph.length]; 
    q.add(0);

    while(!q.isEmpty()){
        int curr = q.remove();
        if(!visited[curr]){
            System.out.print(curr+" ");
            visited[curr] = true;
            // finding the neighbour wala part
            for(int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
}




// dfs --> recursive manner 

public static void dfs(ArrayList<Edge> []graph, int curr, boolean vis[]){
    System.out.print(curr+" ");
    vis[curr]=true;
    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){
            dfs(graph,e.dest,vis);
        }
    }
}
    // array of arraylist---> creating the graph
    static void createGraph(ArrayList<Edge> graph[]){
        // initialized the empty arraylist
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,0,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        
        graph[6].add(new Edge(6,5,1));
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph []= new ArrayList[V];
        createGraph(graph);

        bfs(graph);
System.out.println();
        dfs(graph,0,new boolean[V]);
    }
}
