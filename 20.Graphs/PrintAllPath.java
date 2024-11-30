import java.util.ArrayList;

public class PrintAllPath {
    
        static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        /*
         * 
         *   1--3
         * /    | \
         * 0    |  5 -- 6
         * \    | /
         *   2--4
         * 
         */

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }


    public static void printAllPath(ArrayList<Edge> graph[], int src, int dst, StringBuilder path,boolean vis[]){
        if(src == dst){
            path.append(dst);
            System.out.println(path); 
            path.deleteCharAt(path.length()-1);
            return;
        }

        vis[src] = true;
        path.append(src);
           

        for(Edge e : graph[src]){
            if(vis[e.dest]== false){
                printAllPath(graph, e.dest, dst, path, vis);
            }
        }

        vis[src] = false;
        path.deleteCharAt(path.length()-1);
        
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        
        printAllPath(graph,0,5,new StringBuilder(""),vis);

    }

}
