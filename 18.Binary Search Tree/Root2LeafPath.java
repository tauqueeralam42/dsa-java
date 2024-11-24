public class Root2LeafPath {
    
    public static void root2LeafPath(BST.Node root, String path) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.println(path + root.data);
        }

        root2LeafPath(root.left, path + root.data + "->");
        root2LeafPath(root.right, path + root.data + "->");
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7, 6 };
        BST.Node root = BST.buildBST(nodes);
        root2LeafPath(root, "");
    }
}
