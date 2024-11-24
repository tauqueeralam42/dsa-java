public class ValidBST {
    
    public static boolean isValidBST(BST.Node root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isValidBST(BST.Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7, 6 };
        BST.Node root = BST.buildBST(nodes);
        System.out.println(isValidBST(root));
    }
}
