import java.util.*;

public class KosarajuAlgo {

    static class Edge{
        int src;
        int dest;

        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        int n = graph.length;
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public static void topologicalSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> st){
        vis[curr] = true;
        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                topologicalSort(graph, e.dest, vis, st);
            }
        }
        st.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void scc(ArrayList<Edge> graph[]){
        int n = graph.length;
        boolean vis[] = new boolean[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            if(vis[i] == false){
                topologicalSort(graph, i, vis, st);
            }
        }

        ArrayList<Edge> revGraph[] = new ArrayList[n];
        for(int i = 0; i < n; i++){
            vis[i] = false;
            revGraph[i] = new ArrayList<>();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                revGraph[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        while(st.size()>0){
            int node = st.pop();
            if(vis[node]== false){
                dfs(revGraph, node, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        scc(graph);
    }
    
}
