import java.util.*;
public class cycle_detection {
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                }        
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr] = true;
        // now checking the neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
             // case 3: not visited neighbour appeared apply simple dfs if even then cycle exist then return true
            if(!vis[e.dest]){
                if( detectCycleUtil(graph,vis,e.dest,curr)){
                return true;
                }
            }
            // case 1;
            else if(vis[e.dest] && e.dest !=par){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V =5;
        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
