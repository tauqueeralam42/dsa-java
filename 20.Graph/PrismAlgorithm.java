import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrismAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge> ();
        }

        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));

        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,40));
        
        graph[2].add(new Edge(2, 0,15));
        graph[2].add(new Edge(2, 3,50));

        graph[3].add(new Edge(3, 0,30));
        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 2,50));

    }

    static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p){
            return this.cost - p.cost;
        }
    }

    public static void prismAlgo(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        ArrayList<Edge> edges = new ArrayList<>();

        pq.add(new Pair(0, 0));
        int mstCost =0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstCost += curr.cost;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("Min cost of Spanning Tree = "+mstCost);
    }

    public static void main(String[] args) {
         int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        prismAlgo(graph);
    }
}