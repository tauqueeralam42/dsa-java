import java.util.*;

public class CycleDirectedGraph {

    static class Edge{
        int src;
        int dest;

        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], int curr, boolean vis[], boolean recStack[]){
        vis[curr] = true;
        recStack[curr] = true;

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                if(isCycleDirected(graph, e.dest, vis, recStack)){
                    return true;
                }
            }else if(recStack[e.dest]){
                return true;
            }
        }
        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args){
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        boolean recStack[] = new boolean[v];

        System.out.println(isCycleDirected(graph, 0, vis, recStack));


    }
    
}
