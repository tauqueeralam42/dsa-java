import java.util.*;

public class BFS {

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
         *  /  | \
         * 0   |  5 -- 6
         *  \  | /
         *   2-4
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

    public static void bfs(ArrayList<Edge> graph[], boolean visited[], int s) {

        Queue<Integer> q = new LinkedList<>();

        q.add(s);

        while (q.size() != 0) {
            int node = q.poll();
            if (visited[node] == false) {
                visited[node] = true;
                System.out.print(node + " ");
                for (Edge edge : graph[node]) {
                    if (!visited[edge.dest]) {
                        q.add(edge.dest);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                bfs(graph, visited, i);
            }
        }

    }
}
