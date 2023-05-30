import java.util.*;
import java.io.*;
import java.lang.*;
class Edge implements Comparable<Edge> {
    int src, dest, wt;

    Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }

    public int compareTo(Edge that) {
        return this.wt - that.wt;
    }
}

public class kruskals {
    static int[] p, rank[];

    static void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if (rx == ry)
            return;
        p[ry] = rx;// parent of ry is rx
    }

    static int find(int x) {
        if (p[x] == x)
            return x; // base case
        return find(p[x]); // iterative
    }




    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        boolean added[][] = new boolean[V][V];
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                ArrayList<Integer> cur = adj.get(i).get(j);
                if (!added[i][cur.get(0)]) {

                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i] = true;
                    edges.add(new Edge(i, cur.get(0), cur.get(1)));
                }
            }
        }
        p = new int[V];
        for (int i = 0; i < V; i++) {
            p[i] = i;
        }
        Collections.sort(edges);
        int count = 1;
        int ans = 0;
        for (int i = 0; i < V; i++) {
            Edge edge = edges.get(i);
            int rx = find(edge.src);
            int ry = find(edge.src);
            if (rx != ry) {
                union(rx, ry);
                count++;
                ans += edge.wt;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            int i=0;
            while(i++<E){
                String S[]= read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);

                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            kruskals ob = new kruskals();
            System.out.println(ob.spanningTree(V, adj));
        }


    }
}
