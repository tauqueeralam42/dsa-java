public class DiameterOfTree {

    public static class Info{
        int dia;
        int ht;

        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter(BinaryTree.Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info left = diameter(root.left);
        Info right = diameter(root.right);

        int dia = Math.max(left.ht + right.ht + 1, Math.max(left.dia, right.dia));
        int ht = Math.max(left.ht, right.ht) + 1;

        return new Info(dia, ht);
    }

    public static void main(String[] args){
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree.Node root = BinaryTree.buildTree(nodes);
        System.out.println(diameter(root).dia);
    }
    

}
