// note ---> the acyclic graphs are always bipartite and even numbered one as well
// but the odd numbered vertex graphs are non bipartite
// O(V+E)

// graph coloring approach 
import java.util.*;
public class bipartite{
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
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
      int color[]=new int[graph.length];
// filling the values with -1
      for(int i=0;i<color.length;i++){
        color[i]=-1;
      }
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<graph.length;i++){
        if(color[i]==-1){
            q.add(i);
            color[i]=0;// 0--> yellow
            // bfs starts
            while(!q.isEmpty()){
                int curr=q.remove();
                 for(int j=0;j<graph[curr].size();j++){
                    Edge e = graph[curr].get(j);
                    // case 1--> neighbour has no color
                    if(color[e.dest]==-1){
                        if(color[curr]==0){
                            color[e.dest]=1;
                            q.add(e.dest);
                        }
                        else{
                            color[e.dest]=0;
                            q.add(e.dest);
                        }
                    }
                    // case 2: if colored
                    else{
                        if(color[curr]==color[e.dest]){
                            return false;
                        }
                    }
                 }
                 
            }
        }
      }
      return true;
    }

    public static void main(String[] args) {
        int V =5;
        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipartite(graph));
    }
}