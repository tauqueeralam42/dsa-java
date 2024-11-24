public class DeleteNode {
    
    public static BST.Node deleteNode(BST.Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    public static int minValue(BST.Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7, 6 };
        BST.Node root = BST.buildBST(nodes);
        BST.inorder(root);
        System.out.println();
        root = deleteNode(root, 3);
        BST.inorder(root);
    }
}
