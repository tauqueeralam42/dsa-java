
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertBSTtoBalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node convertBSTtoBalancedBST(Node root) {
        if (root == null) {
            return null;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return buildBalancedBST(arr, 0, arr.size() - 1);
    }

    public static Node buildBalancedBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = buildBalancedBST(arr, start, mid - 1);
        root.right = buildBalancedBST(arr, mid + 1, end);
        return root;
    }

    public static void inorderTraversal(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, arr);
        arr.add(root.data);
        inorderTraversal(root.right, arr);

    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node node = q.poll();
                System.out.print(node.data + " ");
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(7);
        root.left.left = new Node(6);
        root.left.left.left = new Node(5);

        root.right = new Node(9);
        root.right.right = new Node(10);
        root.right.right.right = new Node(11);

        levelOrder(root);

        Node newRoot = convertBSTtoBalancedBST(root);
        levelOrder(newRoot);
    }
}
