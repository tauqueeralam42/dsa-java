import java.util.*;

public class TopView {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        int min = 0;
        int max = 0;

        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();

        q.add(new Info(root, 0));
        while (!q.isEmpty()) {

            Info info = q.poll();

            if (!map.containsKey(info.hd)) {
                map.put(info.hd, info.node);
            }

            if (info.node.left != null) {
                min = Math.min(min, info.hd - 1);
                q.add(new Info(info.node.left, info.hd - 1));
            }
            
            if (info.node.right != null) {
                max = Math.max(max, info.hd + 1);
                q.add(new Info(info.node.right, info.hd + 1));
            }

        }

        for (int i = min; i <= max; i++) {
            Node node = map.get(i);
            System.out.print(node.data + " ");
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);

    }
}
