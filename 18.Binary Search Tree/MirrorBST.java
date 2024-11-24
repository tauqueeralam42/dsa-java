public class MirrorBST {
        
        public static BST.Node mirrorBST(BST.Node root) {
            if (root == null) {
                return null;
            }
    
            BST.Node left = mirrorBST(root.left);
            BST.Node right = mirrorBST(root.right);
    
            root.left = right;
            root.right = left;
    
            return root;
        }
    
        public static void main(String[] args) {
            int nodes[] = { 5, 1, 3, 4, 2, 7, 6 };
            BST.Node root = BST.buildBST(nodes);
            BST.inorder(root);
            System.out.println();
            root = mirrorBST(root);
            BST.inorder(root);
        }
}
