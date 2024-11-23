public class CountNodes {

    public static int countNodes(BinaryTree.Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree.Node root = BinaryTree.buildTree(nodes);
        System.out.println(countNodes(root));
    }

}
