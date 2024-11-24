public class SearchBST {

    public static Boolean searchBST(BST.Node root, int val) {
        if (root == null) {
            return false;
        }

        if (root.data == val) {
            return true;
        }

        if (val < root.data) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7, 6 };
        BST.Node root = BST.buildBST(nodes);
        System.out.println(searchBST(root, 9));
    }
}
