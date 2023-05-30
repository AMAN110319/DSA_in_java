// // ADJANCY LIST


// import java.util.*;
// public class representation{

//     // A utility function to add an edge in an
//     // undirected graph

//     static void addEdge(ArrayList<ArrayList<Integer>> adj,
//                         int u, int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
 
//     // A utility function to print the adjacency list
//     // representation of graph
//     static void printGraph(ArrayList<ArrayList<Integer> > adj)
//     {
//         for (int i = 0; i < adj.size(); i++) {
//             System.out.println("\nAdjacency list of vertex"
//                                + i);
//             System.out.print("head");
//             for (int j = 0; j < adj.get(i).size(); j++) {
//                 System.out.print(" -> "
//                                  + adj.get(i).get(j));
//             }
//             System.out.println();
//         }
//     }
 
//     // Driver Code
//     public static void main(String[] args)
//     {
//         // Creating a graph with 5 vertices
//         int V = 5;
//         ArrayList<ArrayList<Integer> > adj
//             = new ArrayList<ArrayList<Integer> >(V);
 
//         for (int i = 0; i < V; i++)
//             adj.add(new ArrayList<Integer>());
 
//         // Adding edges one by one
//         addEdge(adj, 0, 1);
//         addEdge(adj, 0, 4);
//         addEdge(adj, 1, 2);
//         addEdge(adj, 1, 3);
//         addEdge(adj, 1, 4);
//         addEdge(adj, 2, 3);
//         addEdge(adj, 3, 4);
 
//         printGraph(adj);
//     }
// }










// // 2nd way to use adajency list 

import java.util.*;
public class representation{
    // storig the edges data
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


    public static void main(String[] args) {
        int V =5;
        // using array of arraylist technique here
        ArrayList<Edge> graph[] =new ArrayList[V]; //null stored
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<Edge>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1,5));
        // 1 vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        // 2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        // 3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        // 4 vertex
        graph[4].add(new Edge(4,2,2));


        // 2's neighbors 
        for(int i = 0; i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}