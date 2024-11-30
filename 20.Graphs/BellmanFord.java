import java.util.ArrayList;

public class BellmanFord {

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
        int v = graph.length;
        for(int i =0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int V = graph.length;

        int dis[] = new int[V];
        for(int i = 0; i<V; i++){
            if(i!=src)
                dis[i] = Integer.MAX_VALUE;
            else
                dis[i] = 0;
        }

        for(int k = 0; k<V-1; k++ ){
            for(int i = 0; i<V; i++){
                for(Edge e : graph[i]){
                    int u = e.src;
                    int v = e.dest;
                    if(dis[u] != Integer.MAX_VALUE && dis[u] + e.wt < dis[v]){
                        dis[v] = dis[u] + e.wt;
                    }
                }
            }
        }

        for(int i = 0; i<V; i++){
            System.out.println("Distance of "+i+" from "+src+" is "+dis[i]);
        }
    }

    public static void main(String[] args){
        int n = 5;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
    
}
