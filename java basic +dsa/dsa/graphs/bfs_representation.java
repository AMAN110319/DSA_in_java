import java.util.*;
public class bfs_representation{
    private LinkedList<Integer>[] adj;
    private int E;
    private int V;
    public bfs_representation(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v=0;v<V;v++){
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v)
    {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }
 
    public  String  toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+"vertices"+E+"edges\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for(int w: adj[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public void bfs(int s){
        boolean []visited = new boolean[V]; // visited array to keep track of visited vertices
        Queue <Integer> q = new LinkedList<Integer>();// queue only as reference
        visited[s] = true; 
        q.add(s);
        while(!q.isEmpty()){
         int u = q.poll();
         System.out.print(u +" ");
        for( int v: adj[u]){
            if(!visited[v]){
                visited[v] = true;
                q.add(v);
            }
         }   
        }
    }

    // iterative way
    public  void dfs_iter(int s){
        boolean []visited = new boolean[V];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(s);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.print(u+" ");
                for(int v: adj[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    } 
    // Driver Code
    public static void main(String[] args)
    {
        bfs_representation g = new bfs_representation(5);
        g.addEdge( 0, 1);
        g.addEdge( 0, 3);
        g.addEdge( 1, 2);
        g.addEdge( 2, 4);
        g.addEdge( 2, 3);
        
        // System.out.println(g);
        System.out.println("the bfs traversal of the tree is:");
        g.bfs(0);
        System.out.println("\nthe dfs traversal of the tree is:");
        g.dfs_iter(0);
    }
}
