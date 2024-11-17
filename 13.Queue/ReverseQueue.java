import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        int front = q.poll();
        reverse(q);
        q.add(front);
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        reverse(q);
        System.out.println(q);
    }
}
