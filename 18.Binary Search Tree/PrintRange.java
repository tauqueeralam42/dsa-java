public class PrintRange {
    
    public static void printRange(BST.Node root, int low, int high) {
        if (root == null) {
            return;
        }

        if (root.data > low) {
            printRange(root.left, low, high);
        }

        if (root.data >= low && root.data <= high) {
            System.out.print(root.data + " ");
        }

        if (root.data < high) {
            printRange(root.right, low, high);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7, 6 };
        BST.Node root = BST.buildBST(nodes);
        printRange(root, 2, 6);
    }
}
