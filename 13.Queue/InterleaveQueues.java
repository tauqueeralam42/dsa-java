import java.util.Queue;
import java.util.LinkedList;

public class InterleaveQueues {

    public static void interleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue size should be even");
            return;
        }

        int halfSize = q.size() / 2;
        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < halfSize; i++) {
            q1.add(q.remove());
        }

        while (!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interleave(q);
        System.out.println(q);
    }
}
