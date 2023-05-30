// here we will be using the visited concept but also the concept of the
// explicit recursion stack to track the cycle repeatition and that's it.
// boolean stack hoga whose work isto track latest vertex present 

import java.util.*;


public class cycles_directed {
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
        // // cyclic graph
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,0));

        // // //acyclic
        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,3));

        // graph[2].add(new Edge(2,3));

        
    }
    public static boolean isCycle(ArrayList<Edge> graph[]){
        // two arrays to check whether visited or not
        boolean vis[]= new boolean[graph.length];
        // for current stack frame 
        boolean stack[]= new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i,vis,stack)){
                    return true;
                }
            }
        }

        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr] =true;
        stack[curr] =true;
        // check for neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr] =false;
        return false;
    }


    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);

        System.out.println(isCycle(graph));
    }
}
