import java.util.*;

public class Dijkstra{
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }

    static class Pair implements Comparable<Pair>{
        int node;
        int dis;

        Pair(int node, int dis){
            this.node = node;
            this.dis = dis;
        }

        @Override
        public int compareTo(Pair o){
            return this.dis - o.dis;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int n = graph.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[n];
        int dis[] = new int[n];

        for(int i=0; i<n; i++){
            if(i != src)
                dis[i] = Integer.MAX_VALUE;
            else
                dis[i] = 0;
        }

        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(vis[curr.node] == false){
                vis[curr.node] = true;

                for(int i =0 ; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dis[u] + e.wt < dis[v]){
                        dis[v] = dis[u] + e.wt;
                        pq.add(new Pair(v, dis[v]));
                    }

                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.println("Distance of "+i+" from "+src+" is "+dis[i]);
        }

    }

    public static void main(String[] args){
        int n = 6;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}