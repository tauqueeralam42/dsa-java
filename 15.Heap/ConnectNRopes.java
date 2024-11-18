import java.util.PriorityQueue;

public class ConnectNRopes {

    public static int minCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            cost += first + second;
            pq.add(first + second);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] ropes = { 2, 3, 3, 6, 4 };
        System.out.println(minCost(ropes));
    }

}
